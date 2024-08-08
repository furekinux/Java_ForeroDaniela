<h1 align="center">📎PATRONES DE DISEÑO CREACIONALES✏️</h1>
<p align="center">El objetivo de los patrones de diseño creacionales es resolver los problemas de creación de instancia. Estos ayudan a delegar la responsabilidad de creación de objetos en situaciones necesarias. Proporcionan mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización de código existente.</p>


<h3 align="center">‎ </h3>

<h1 align="center">${\color{#ff0000}Singleton}$ ó ${\color{#ff3838}Instancia \space única}$</h1>
<p>Este patrón de diseño creacional restringe la creación a un único objeto la creación de objetos pertenecientes a una clase y asegura de que sólo haya esta instancia única. Además, proporciona un punto de acceso global a dicha instancia.</p>
<table align="center">
  <tr>
    <td width="50%"><h3 align="center">Ventajas😄</h3></td>
    <td width="50%"><h3 align="center">Desventajas💀</h3></td>
  </tr>
  <tr>
    <td>
      <ul type="circle">
        <li>Se puede tener la <b>certeza de que una clase tiene una única instancia.</b></li>
        <li>Se obtiene un <b>punto de acceso global a dicha instancia.</b></li>
        <li>El objeto Singleton <b>solo se inicializa cuando se requiere por primera vez.</b></li>
      </ul>
    </td>
    <td>
      <ul type="square">
        <li><b>⚠️Vulnera el Principio de responsabilidad única (SRP).</b> El patrón resuelve dos problemas al mismo tiempo.</li>
        <li><b>⚠️Puede enmascarar un mal diseño,</b> por ejemplo, cuando los componentes del programa saben demasiado los unos sobre los otros.</li>
        <li><b>⚠️Requiere de un tratamiento especial en un entorno con múltiples hilos de ejecución,</b> para que varios hilos <b>NO</b> creen un objeto Singleton varias veces.</li>
        <li><b>⚠️Puede resultar complicado realizar la prueba unitaria del código cliente</b> del Singleton porque muchos <b>frameworks de prueba dependen de la herencia</b> a la hora de crear objetos simulados (mock objects). </li>
      </ul>
    </td>
  </tr>
</table>
<p align="center">
  <a href="https://refactoring.guru/es/design-patterns/singleton/java/example">Singleton en Java</a>
</p>


<h3 align="center">‎ </h3>

<h1 align="center">${\color{#d17600}Prototype}$ ó ${\color{#d17600}Prototipo, \space Clon, \space Clone}$</h1>
<p>Es un patrón de diseño creacional que nos permite copiar objetos existentes sin que el código dependa de sus clases.</p>
<table align="center">
  <tr>
    <td width="50%"><h3 align="center">Ventajas😁</h3></td>
    <td width="50%"><h3 align="center">Desventajas💀</h3></td>
  </tr>
  <tr>
    <td>
      <ul type="circle">
        <li><b>Se puede clonar objetos sin acoplarlos</b> a sus clases concretas.</li>
        <li><b>Se puede evitar un código de inicialización repetido</b> clonando prototipos prefabricados.</li>
        <li>Se puede <b>crear objetos complejos con más facilidad.</b></li>
        <li>Se obtiene una <b>alternativa a la herencia</b> al tratar con preajustes de configuración para objetos complejos.</li>
      </ul>
    </td>
    <td>
      <ul type="square">
        <li><b>⚠️Clonar objetos complejos con referencias circulares puede resultar complicado.</b></li>
      </ul>
    </td>
  </tr>
</table>
<p align="center">
  <a href="https://refactoring.guru/es/design-patterns/prototype/java/example">Prototype en Java</a>
</p>


<h3 align="center">‎ </h3>

<h1 align="center">${\color{#34ad00}Abstract \space Factory}$</h1>
<p>Permite proporcionar una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.</p>
<table align="center">
  <tr>
    <td width="50%"><h3 align="center">Ventajas😄</h3></td>
    <td width="50%"><h3 align="center">Desventajas💀</h3></td>
  </tr>
  <tr>
    <td>
      <ul type="circle">
        <li>Se puede tener la certeza de que los productos que obtienes de una fábrica son <b>compatibles entre sí.</b></li>
        <li><b>Se evita un acoplamiento fuerte</b> entre productos concretos y el código cliente.</li>
        <li><b>Cumple con el Principio de responsabilidad única SRP.</b> Se puede mover el código de creación de productos a un solo lugar, haciendo que el código sea más fácil de mantener.</li>
        <li><b>Cumple con el Principio de abierto/cerrado.</b> Se pueden introducir nuevas variantes de productos sin descomponer el código cliente existente.</li>
      </ul>
    </td>
    <td>
      <ul type="square">
        <li><b>⚠️Puede ser que el código se complique más de lo que debería,</b> ya que se introducen muchas nuevas interfaces y clases junto al patrón.</li>
      </ul>
    </td>
  </tr>
</table>
<p align="center">
  <a href="https://refactoring.guru/es/design-patterns/abstract-factory/java/example">Abstract Factory en Java</a>
</p>


<h3 align="center">‎ </h3>

<h1 align="center">${\color{#0057c2}Builder}$</h1>
<p>Ayuda a crear objetos complejos de manera sencilla, legible y escalable. Se utiliza en situaciones en las que debe construirse un objeto repetidas veces. Nos permite construir objetos complejos paso a paso. El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.</p>
<table align="center">
  <tr>
    <td width="50%"><h3 align="center">Ventajas😄</h3></td>
    <td width="50%"><h3 align="center">Desventajas💀</h3></td>
  </tr>
  <tr>
    <td>
      <ul type="circle">
        <li></li>
      </ul>
    </td>
    <td>
      <ul type="square">
        <li></li>
      </ul>
    </td>
  </tr>
</table>
<p align="center">
  <a href="">Builder en Java</a>
</p>


<h3 align="center">‎ </h3>

<h1 align="center">${\color{#7e00c2}Factory Method}$</h1>
<p>Nos ayuda a tener instancias de un objeto dado el tipo. Este patrón nos permite crear diferentes objetos usando la palabra new, pero no directamente en la clase que lo necesita si no desde un método que podríamos llamar fabrica y esta a su vez nos devolverá el objeto solicitado, pero desde otra clase.</p>
<table align="center">
  <tr>
    <td width="50%"><h3 align="center">Ventajas😄</h3></td>
    <td width="50%"><h3 align="center">Desventajas💀</h3></td>
  </tr>
  <tr>
    <td>
      <ul type="circle">
        <li></li>
      </ul>
    </td>
    <td>
      <ul type="square">
        <li></li>
      </ul>
    </td>
  </tr>
</table>
