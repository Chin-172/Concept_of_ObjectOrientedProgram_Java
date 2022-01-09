package Package1;

public class ElementA {

  void methodA(String element){
    // Non-modifier method means that method only can be used in same package.
    System.out.println("This is a methodA for element "+element);
  }

  public void methodA(){
    this.methodA("ElementA");
  }
}
