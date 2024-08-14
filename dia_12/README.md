<h1 align="center">👩‍💻 Patrones de diseño de Software🖱️</h1>
<p>Son soluciones habituales a problemas comunes en el diseño de software. Cada patrón es como un plano que se puede personalizar para resolver un problema de diseño particular de tu código. Estos patrones se dividen en tres tipos:</p>

<h2>Tipos de Patrones de diseño</h2>

- [Patrones Creacionales](#creacionales)
- [Patrones Estructurales](#estructurales)
- [Patrones de Comportamiento](#comportamiento)

<h2><a name="creacionales">Patrones de diseño Creacionales</a></h2>
<p>Proporcionan varios mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización del código existente. Existen 5 principales:</p>

<h3>Factory Method</h3>
<p>Se caracteriza por la creación de una "fábrica" de objetos que poseen características similares por medio de una interfáz, permite que las subclases instanciar su clase. Finalmente, el trabajo de creación es asignado a las subclases.</p>
<p>Ver el siguiente enlace para visualizar la implementación a nivel de código: <a href="https://github.com/furekinux/Java_ForeroDaniela/tree/main/dia_12/PatronesCreacionales/src/FACTORY">Implementación Factory Method</a></p>

<h3>Abstract Factory</h3>
<p>...</p>
<p>Ver el siguiente enlace para visualizar la implementación a nivel de código: <a href="">Implementación Abstract Factory</a></p>

<h3>Builder</h3>
<p>Permite la construcción paso a paso de objetos complejos, es decir, se modulariza la construcción de los objetos sin necesidad de hacer que una sola clase se encargue.</p>
<p>Ver el siguiente enlace para visualizar la implementación a nivel de código: <a href="https://github.com/furekinux/Java_ForeroDaniela/tree/main/dia_12/PatronesCreacionales/src/BUILDER">Implementación Builder</a></p>

<h3>Prototype</h3>
<p>Permite la clonación exacta de instancias ya existentes por medio de un método de Cloneable.</p>
<p>Ver el siguiente enlace para visualizar la implementación a nivel de código: <a href="https://github.com/furekinux/Java_ForeroDaniela/tree/main/dia_12/PatronesCreacionales/src/PROTOTYPE">Implementación Prototype</a></p>

<h3>Singleton</h3>
<p>Este patrón asegura que una clase tenga una ÚNICA instancia, es decir, cada que se utilice, se está utilizando la misma instancia creada anteriormente.</p>
<p>Ver el siguiente enlace para visualizar la implementación a nivel de código: <a href="https://github.com/furekinux/Java_ForeroDaniela/tree/main/dia_12/PatronesCreacionales/src/SINGLETON">Implementación Singleton</a></p>

<h2><a name="estructurales">Patrones de diseño Estructurales</a></h2>
<p>Son patrones que explican cómo ensamblar objetos y clases en estructuras más grandes, a la vez que se mantiene la flexibilidad y eficiencia de estas estructuras. Los más importantes son los siguientes:</p>

<h3>Adapter</h3>
<p>Se trata de un patrón de diseño que permite la colaboración entre objetos con interfaces incompatibles entre sí. Es como un adaptador por medio del cual se permite la compatibilidad entre clases incompatibles sin él.</p>
<p align="center"><img src="https://refactoring.guru/images/patterns/diagrams/adapter/problem-es.png" width="60%"/></p>
<p align="center"><img src="https://cdn-icons-png.freepik.com/512/5083/5083079.png" width="5%"/></p>
<p align="center"><img src="https://refactoring.guru/images/patterns/diagrams/adapter/solution-es.png" width="60%"/></p>
<p>Al utilizar un adaptador, se vuelve compatible el archivo con el otro tipo de archivo sin perder la información que contiene originalmente. Es como si se trata de un cable USB que necesita conectarse a un puerto distinto al suyo.</p>

<h4>Ejemplo de Implementación</h4>

<p>Se tiene una clase de agujero circular:</p>

```java
public class RoundHole {
    // Agregar atributo de radio al agujero
    private double radius;

    // Constructor del agujero circular con su radio
    public RoundHole(double radius) {
        this.radius = radius;
    }

    // Obtener el valor del radio
    public double getRadius() {
        return radius;
    }

    // Realiza el proceso de decir cuando la figura cabe o no en el agujero de acuerdo con el radio
    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
```
<p>Luego, una clase de piezas redondas, como lo sería un cilindo:</p>

```java
public class RoundPeg {
    private double radius;

    // Contructor vacío
    public RoundPeg() {}

    // Contructor con el radio de la pieza
    public RoundPeg(double radius) {
        this.radius = radius;
    }

    // Retorna el radio de la pieza
    public double getRadius() {
        return radius;
    }
}
```
<p>La clase RoundPeg(Clase de piezas redodas) es compatibble con la clase RoundHole(Clase de agujeros en forma circular), al ejecutar el comando para saber si la pieza cumple con el requisito de que su radio sea menor o igual al radio del agujero, se retornará que efecttivamente cabe.</p>

<p>Por otro lado, si tenemos una pieza cuadrada como la siguiente:</p>

```java
public class SquarePeg {
    // Se agrega el atributo ancho del cuadrado
    private double width;

    // Constructor de la pieza
    public SquarePeg(double width) {
        this.width = width;
    }

    // Devuelve el ancho del cuadrado de la pieza
    public double getWidth() {
        return width;
    }

    // Calcula el área del cuadrado
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2); // Math.pow realiza la potencia de un número A potenciado a la B
        return result;
    }
}
```
<p>Si ententamos ejecutar la verificación de si la pieza cabe o no, no se tendrá un resultado acertado, dado que se habla del ancho del cuadrado, no de un radio como lo dice el método de verificación. Teniendo en cuenta esto, se crea la clase de adaptador:</p>

```java
public class SquarePegAdapter extends RoundPeg { // Extiende de la clase RoundPeg

    // Se agrega como atributo la pieza cuadrada
    private SquarePeg peg;

    // Constructor con el objeto de la pieza cuadrada
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }
    
    @Override // Realiza Override para modificar la función con la que normalmente obtendría el radio
    public double getRadius() {
        double result;

        // Se calcula la longitud entre un vértice y el centro del cuadrado, siendo equivalente al radio dentro de una circunferencia
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
```
<p>Finalmente, se hace uso de las clases en la principal de la siguiente manera:</p>

```java
public class Main {
    public static void main(String[] args) {
        
        // Una pieza circular, cumple con los requisitos de tener un radio menor o igual y cabe en el agujero
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Pieza circular de radio 5 cabe en el agujero circular de radio 5.");
        }

        // Si se usara el mètodo con las siguientes piezas, no se obtendría un resultado porque no tienen radio
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        // El adaptador se encarga de hallar el equivalente al radio
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            // Si la pieza cabe, se da el siguiente mensaje
            System.out.println("Pieza cuadrara de ancho 2 cabe en el agujero circular de radio 5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            // Si la pieza NO cabe, se da el siguiente mensaje
            System.out.println("Pieza cuadrara de ancho 20 no cabe en el agujero circular de radio 5.");
        }
    }
}
```
<h3>Bridge</h3>
<h3>Composite</h3>
<h3>Decorator</h3>
<h3>Facade</h3>
<h3>Flyweight</h3>
<h3>Proxy</h3>

<h2><a name="comportamiento">Patrones de diseño de Comportamiento</a></h2>
<p>Este patrón trata con algoritmos y la asignación de responsabilidades entre objetos.</p>

<h3>Chain of Responsability</h3>
<h3>Command</h3>
<h3>Iterator</h3>
<h3>Mediator</h3>
<h3>Memento</h3>
<h3>Observer</h3>
<h3>State</h3>
<h3>Strategy</h3>
<h3>Template Method</h3>
<h3>Visitor</h3>
