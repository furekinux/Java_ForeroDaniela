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

<p>Se separan los métodos en 2 clases distintas: FacturaImpresion y FacturaPersistencia, esto con el fin de no veernos obligados a realizar modificaciones que afecten a una clase grande que contenga distintos métodos para distintos propositos.</p>
<p align="center"><img src="https://www.guvi.in/blog/wp-content/uploads/2022/06/1_P3oONz9Da3Tc1w97fMV73Q-1200x854.png" width="70%"></p>


<h2>Open-Closed Principle</h2>
<p>El principio de apertura y cierre <b>exige que las clases deban estar abiertas a la extensión y cerradas a la modificación.</b> Los términos Modificación y Extensión se definen de la siguiente manera:</p>
<ul type="square">
  <li>Modificación significa cambiar el código de una clase existente.</li>
  <li>Extensión significa agregar una nueva funcionalidad.</li>
</ul>
<p>Es decir, que podamos agregar nuevas funcionalidad, pero no podemos cambiar una ya existente de una clase</p>
<p align="center"><img src="https://www.guvi.in/blog/wp-content/uploads/2022/06/1_0MtFBmm6L2WVM04qCJOZPQ-1200x684.png" width="70%"></p>


<h2>Liskov Substitution Principle</h2>
<p>El Principio de Sustitución de Liskov establece que <b>las subclases deben ser sustituibles por sus clases base.</b> En otras palabras, las clases hijas deberían cumplir las mismas funciones de la clase padre debido a la herencia.</p>
<h3>implementación</h3>
<p>El siguiente ejemplo fue tomado de la página <a href="https://www.freecodecamp.org/espanol/news/los-principios-solid-explicados-en-espanol/">www.freecodecamp.org</a>.</p>
<p>En este ejemplo, una clase padre llamada Rectángulo contiene sus métodos y constructores.</p>

```java
class Rectangulo {
	protected int ancho, alto;

	public Rectangulo() {
	}

	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getArea() {
		return ancho * alto;
	}
}
```
<p>Luego, está una clase hija de Rectangulo llamada Cuadrado, la cuál posee el mismo método de getArea(), que como su nombre lo dice, calcula el área de dicha figura. Adicionalmente realiza un Override para modificar los setters para adaptarlos a la figura de lados iguales.</p>

```java
class Cuadrado extends Rectangulo {
	public Cuadrado() {}

	public Cuadrado(int lado) {
		ancho = alto = lado;
	}

	@Override
	public void setAncho(int ancho) {
		super.setAncho(ancho);
		super.setAlto(ancho);
	}

	@Override
	public void setAlto(int alto) {
		super.setAlto(alto);
		super.setAncho(alto);
	}
}
```
<p align="center"><img src="https://www.guvi.in/blog/wp-content/uploads/2022/06/1_yKk2XKJaCLNlDxQMx1r55Q-1142x1024.png" width="70%"></p>

<h2>Interface Segregation Principle</h2>
<p>La segregación significa <b>mantener las cosas separadas</b>, y el Principio de Segregación de Interfaces se trata de <b>separar las interfaces</b>. Establece que <b>muchas interfaces específicas</b> del cliente son mejores que una interfaz de propósito general. No se debe obligar a los clientes a implementar una función que no necesitan.</p>
<h3>Implementación</h3>
<p>El siguiente ejemplo fue tomado de la página <a href="https://www.freecodecamp.org/espanol/news/los-principios-solid-explicados-en-espanol/">www.freecodecamp.org</a>.</p>
<p>Se tiene una una interfáz llamada Estacionamiento que contiene las siguientes funciones.</p>

```java
public interface Estacionamiento {
	void aparcarCoche(); // Reducir el recuento de puntos vacíos en 1
	void sacarCoche(); // Aumenta los espacios vacíos en 1
	void getCapacidad(); // Devuelve la capacidad del coche
	double calcularTarifa(Coche coche); // Devuelve el precio en función del número de horas.
	void hacerPago(Coche coche);
}

class Coche {
}
```
<p>Si se quiere implementar un estacionamiento gratis a partir de la anterior clase, se tendrá la siguiente:</p>

```java
public class EstacionamientoGratis implements Estacionamiento {

	@Override
	public void aparcarCoche() {
		
	}

	@Override
	public void sacarCoche() {

	}

	@Override
	public void getCapacidad() {

	}

	@Override
	public double calcularTarifa(Coche coche) {
		return 0;
	}

	@Override
	public void hacerPago(Coche coche) {
		throw new Exception("Estacionamiento es gratis");
	}
}
```
<p>No se cumple con el principio porque la clase se vió obligada a realizar modificaciones a las funciones que incluían el pago por el Estacionamiento, esto puede ser solucionado por medio de la segregación, separando las interfases de tal manera que los datos que involucran el pago se encuentren un una interfáz independiente del Estacionamiento que incluye pago y EstacionamientoGratis que no implementa pagos.</p>
<p align="center"><img src="https://www.freecodecamp.org/espanol/news/content/images/size/w1000/2022/10/SOLID-Tutorial-1024x432.png" width="60%"/></p>
<p align="center"><img src="https://www.guvi.in/blog/wp-content/uploads/2022/06/1_2hmyR9L43Vm64MYxj4Y89w-1200x601.png" width="70%"></p>


<h2>Dependency Inversion Principle</h2>
<p>El principio de inversión de dependencia establece que <b>nuestras clases deben depender de interfaces o clases abstractas en lugar de clases y funciones concretas</b>.</p>
<p align="center"><img src="https://toidicodedao.com/wp-content/uploads/2016/05/oop-principles-15-638.jpg" width="70%"/></p>
