package Package2;
import Package1.ElementA;

public class ObjectB {

  public ObjectB() {
    ElementA elementA = new ElementA();
    // There is no way to call out methodA with given parameter.
    // It is because that method has become protected.

    // elementA.methodA("ObjectB");

    // However, we can call out methodA without passing parameter.
    // Because that method is public method.
    elementA.methodA();
  }
}