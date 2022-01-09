package Package2;

import Package1.ElementA;

public class ObjectA extends ElementA {
//      Private method is not allow to over-ride.
//      @Override
//      public void methodA(String element) {
//        System.out.println("This is a methodA in objectA for the element " + element);
//      }

      @Override
      public  void methodA(){
        System.out.println("This is a methodA in objectA.");
      }
}
