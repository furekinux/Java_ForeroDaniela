<h1><p align="center"><img src="https://www.guvi.in/blog/wp-content/uploads/2022/06/1_wrxj0oBKpA_GXb8LPhXOeg-1200x444.png" width="60%"></p></h1>
<p align="center">Son un conjunto de <b>reglas y mejores prácticas</b> a seguir al diseñar una estructura de clase. Estos cinco principios nos ayudan a comprender la necesidad de ciertos patrones de diseño y arquitectura de software en general.</p>

<h2>Single Responsibility Principle</h2>
<p><b>Una clase debe hacer UNA cosa y, por lo tanto, debe tener una sola razón para cambiar.</b> Es decir, solo un cambio <b>POTENCIAL</b> (ya sea en lógica de base de datos, lógica de registro, etc.) en la especificación del software debería poder afectar la <b>ESPECIFICACIÓN</b> de la clase.</p>

<h3>¿Por qué seguirlo?</h3>

<ul type="square">
  <li><b>Evitar incompatibilidad en proyectos con equipo de trabajo:</b> Muchos equipos diferentes pueden trabajar en el mismo proyecto y editar la misma clase por diferentes motivos, esto podría dar lugar a módulos incompatibles.</li>
  <li><b>Facilita el control de versiones:</b> Si se realiza un cambio a una clase importanteAl seguir el PRU, sabremos que está relacionado con el almacenamiento o con cosas relacionadas con la base de datos.</li>
  <li><b>Menor cantidad de conflictos de fusión:</b> Los archivos tendrán una sola razón para cambiar y los conflictos que existen serán más fáciles de resolver.</li>
</ul>

<h3>implementación</h3>
<p>El siguiente ejemplo fue tomado de la página <a href="https://www.freecodecamp.org/espanol/news/los-principios-solid-explicados-en-espanol/">www.freecodecamp.org</a>.</p>

<p>Inicialmente tenemos la clase Libro, teniendo en cuenta que se trata de una tienda que vende este objeto.Cuenta con el constructor de dicha clase.</p>

```java
class Libro {
	String nombre;
	String nombreAutor;
	int anyo;
	int precio;
	String isbn;

	public Libro(String nombre, String nombreAutor, int anyo, int precio, String isbn) {
		this.nombre = nombre;
		this.nombreAutor = nombreAutor;
		this.anyo = anyo;
        this.precio = precio;
		this.isbn = isbn;
	}
}
```
<p>Luego, se tiene a la clase factura que contiene el constructor de la misma y cada uno de los métodos que posee.</p>

```java
public class Factura {

	private Libro libro;
	private int cantidad;
	private double tasaDescuento;
	private double tasaImpuesto;
	private double total;

	public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
		this.libro = libro;
		this.cantidad = cantidad;
		this.tasaDescuento = tasaDescuento;
		this.tasaImpuesto = tasaImpuesto;
		this.total = this.calculaTotal();
	}

	public double calculaTotal() {
	        double precio = ((libro.precio - libro.precio * tasaDescuento) * this.cantidad);

		double precioConImpuestos = precio * (1 + tasaImpuesto);

		return precioConImpuestos;
	}

	public void imprimeFactura() {
            System.out.println(cantidad + "x " + libro.nombre + " " +          libro.precio + "$");
            System.out.println("Tasa de Descuento: " + tasaDescuento);
            System.out.println("Tasa de Impuesto: " + tasaImpuesto);
            System.out.println("Total: " + total);
	}

        public void guardarArchivo(String nombreArchivo) {
	// Crea un archivo con el nombre dado y escribe la factura.
	}

}
```
<p>El ejemplo cuenta con 3 métodos distintos: calculaTotal, imprimeFactura, guardaArchivo. Las razones por las que no cumple con el principio son las siguientes:</p>

<ul type="square">
  <li>A la hora de realizar una modificación, toda la clase se verá afectada por el cambio, lo cual causará problemas a la hora de realizar control de versiones en el proyecto por parte de otros compañeros que hacen parte.</li>
  <li>Se mezcla la lógica de persistencia con la lógica de negocios en el método guardarArchivo.</li>
</ul>

<p>La aplicación correcta del principio de responsabilidad única es la siguiente:</p>

```java
public class Factura {

	private Libro libro;
	private int cantidad;
	private double tasaDescuento;
	private double tasaImpuesto;
	private double total;

	public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
		this.libro = libro;
		this.cantidad = cantidad;
		this.tasaDescuento = tasaDescuento;
		this.tasaImpuesto = tasaImpuesto;
		this.total = this.calculaTotal();
	}

	public double calculaTotal() {
	        double precio = ((libro.precio - libro.precio * tasaDescuento) * this.cantidad);

		double precioConImpuestos = precio * (1 + tasaImpuesto);

		return precioConImpuestos;
	}
```

```java
public class FacturaImpresion {
    private Factura factura;

    public FacturaImpresion(Factura factura) {
        this.factura = factura;
    }

    public void imprimir() {
        System.out.println(factura.cantidad + "x " + factura.libro.nombre + " " + factura.libro.precio + " $");
        System.out.println("Tasa de Descuento: " + factura.tasaDescuento);
        System.out.println("Tasa de Impuesto: " + factura.tasaImpuesto);
        System.out.println("Total: " + factura.total + " $");
    }
}
```

```java
public class FacturaPersistencia {
    Factura factura;

    public FacturaPersistencia(Factura factura) {
        this.factura = factura;
    }

    public void guardarArchivo(String nombreArchivo) {
        // Crea un archivo con el nombre dado y escribe la factura.
    }
}
```

<p>Se separan los métodos en 2 clases distintas: FacturaImpres, esto con el fin de no veernos obligados a realizar modificaciones que afecten a una clase grande que contenga distintos métodos para distintos propositos.</p>

<p align="center"><img src="https://www.guvi.in/blog/wp-content/uploads/2022/06/1_P3oONz9Da3Tc1w97fMV73Q-1200x854.png" width="70%"></p>


<h2>Open-Closed Principle</h2>
<p><b>Ingrese</b> su texto aqui</p>
<p align="center"><img src="https://www.guvi.in/blog/wp-content/uploads/2022/06/1_0MtFBmm6L2WVM04qCJOZPQ-1200x684.png" width="70%"></p>


<h2>Liskov Substitution Principle</h2>
<p align="center"><img src="https://www.guvi.in/blog/wp-content/uploads/2022/06/1_yKk2XKJaCLNlDxQMx1r55Q-1142x1024.png" width="70%"></p>


<h2>Interface Segregation Principle</h2>
<p align="center"><img src="https://www.guvi.in/blog/wp-content/uploads/2022/06/1_2hmyR9L43Vm64MYxj4Y89w-1200x601.png" width="70%"></p>


<h2>Dependency Inversion Principle</h2>
