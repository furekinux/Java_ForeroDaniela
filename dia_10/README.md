<h1 align="center">${\color{#ff0000}PATRONES \space DE \space DISEÑO \space CREACIONALES}$</h1>
<p>Su objetivo es resolver los problemas de creación de instancia. Estos ayudan a delegar la responsabilidad de creación de objetos en situaciones necesarias. Proporcionan mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización de código existente.</p>

<h2>${\color{#d17600}Singleton}$</h2>
Nos garantiza la existencia de una única instancia para una clase. Es un patrón de diseño que se centra en crear objetos, pero solo una sola instancia del objeto deseado.

<h2>${\color{#34ad00}Prototype}$</h2>
Clona las instancias ya existentes.

<h2>${\color{#0057c2}Abstract Factory}$</h2>
Permite proporcionar una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.

<h2>${\color{#7e00c2}Builder}$</h2>
Ayuda a crear objetos complejos de manera sencilla, legible y escalable. Se utiliza en situaciones en las que debe construirse un objeto repetidas veces.

<h2>Factory Method</h2>
Nos ayuda a tener instancias de un objeto dado el tipo. Este patrón nos permite crear diferentes objetos usando la palabra new, pero no directamente en la clase que lo necesita si no desde un método que podríamos llamar fabrica y esta a su vez nos devolverá el objeto solicitado, pero desde otra clase.
