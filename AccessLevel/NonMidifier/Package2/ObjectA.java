package Package2;

import Package1.ElementA;

public class ObjectA extends ElementA {
//      Non-modifier method is not allow to over-ride because of not in the same package.
//      @Override
//      public void methodA(String element) {
//        System.out.println("This is a methodA in objectA for the element " + element);
//      }

      @Override
      public  void methodA(){
        System.out.println("This is a methodA in objectA.");
      }
}
