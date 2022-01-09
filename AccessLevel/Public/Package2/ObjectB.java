package Package2;
import Package1.ElementA;

public class ObjectB {

  public ObjectB() {
    ElementA elementA = new ElementA();
    elementA.methodA("ObjectB");      // when methodA is public , it works!
  }
}
