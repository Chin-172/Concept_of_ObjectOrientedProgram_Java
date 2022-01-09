package Package1;

public class ElementB {
  public ElementB() {
    ElementA elementA = new ElementA();
    // There is no way to call out private method
    // elementA.methodA("ElementB");
    elementA.methodA();
  }
}
