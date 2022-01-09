package Package1;

public class ElementA {

  private void methodA(String element){
    // Private method means that method only can be used inside that class.
    System.out.println("This is a methodA for element "+element);
  }

  public void methodA(){
    this.methodA("ElementA");
  }
}
