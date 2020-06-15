package other.greenfox.classesandobjects;

abstract class EgySubclass extends Class {

  abstract void absztakt();
  // Ha egy method abstract, akkor az azt tartalmazó class is az lesz.
  // Az absractnak nincs body-ja, viszont minden őt extendelő subclassnek külön override-olnia kell
  // a superclassban lévő (a példában "absztrakt" nevű) abstract methodot.

  // Mikor jó ez?
  // https://www.geeksforgeeks.org/abstract-classes-in-java/

}
