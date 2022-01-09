package Package1;

public class ElementA {

  public void methodA(String element){
    System.out.println("This is a methodA for element "+element);
  }

  public void methodA(){
    this.methodA("ElementA");
  }
}
