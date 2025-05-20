<h1>OOP_PersonTypes</h1>
  <p><strong>About</strong><br />
    Implements a Person class hierarchy with NaturalPerson and LegalEntity subclasses showing polymorphism in Java.
  </p>
  <h2>Commits</h2>
  <h3>May 20, 2025</h3>
  <ul>
    <li><strong>Created Person Class Hierarchy With Subclasses</strong>
      <ul>
        <li>Defined abstract class <code>Person</code> with common properties;</li>
        <li>Created <code>NaturalPerson</code> and <code>LegalEntity</code> subclasses;</li>
        <li>Implemented <code>displayInfo()</code> in each concrete class;</li>
        <li>Added <code>App.java</code> to instantiate and display person data.</li>
      </ul>
    </li>
  </ul>
  <h3>May 19, 2025</h3>
  <ul>
    <li><strong>Initial commit</strong></li>
  </ul>
  <h2>Classes</h2>
  <ul>
    <li><strong>Person (abstract)</strong>: Base class with common attributes (<code>name</code>, <code>address</code>, <code>email</code>) and abstract method <code>displayInfo()</code>.</li>
    <li><strong>NaturalPerson</strong>: Extends <code>Person</code> and adds <code>cpf</code>, <code>gender</code>, and <code>maritalStatus</code>. Overrides <code>displayInfo()</code>.</li>
    <li><strong>LegalEntity</strong>: Extends <code>Person</code> and adds <code>corporateName</code>, <code>cnpj</code>, and <code>companyType</code>. Overrides <code>displayInfo()</code>.</li>
    <li><strong>App</strong>: Demonstrates creating instances of <code>NaturalPerson</code> and <code>LegalEntity</code>, setting properties, and displaying information.</li>
  </ul>
