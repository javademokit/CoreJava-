package innnerclass;

class Outer {
	   void outerMethod() {
	      System.out.println("inside outerMethod");
	   }
	   class Inner {
	     /* public static void main(String[] args){
	         System.out.println("inside inner class Method");
	      }*/
	   }
	}

/***
 * As a side note, we can’t have static method in a nested inner class because an inner class is implicitly associated with an object of its outer class so it cannot define any static method for itself. 
*/