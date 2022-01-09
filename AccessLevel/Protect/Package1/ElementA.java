package Package1;

public class ElementA {

  protected void methodA(String element){
    // Protected Methods mean there only the subclass (child) and the class which place in the same package with current class
    System.out.println("This is a methodA for element "+element);
  }

  public void methodA(){
    this.methodA("ElementA");
  }
}
