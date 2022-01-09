package Package2;
import Package1.ElementA;
public class ObjectA extends ElementA{
    @Override
    public void methodA(String element){
      System.out.println("This is a methodA in objectA for the element "+element);
    }

}
