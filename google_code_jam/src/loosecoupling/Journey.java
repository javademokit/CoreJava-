package loosecoupling;

// create main class Journey
public class Journey {
      public static void main(String[] args) {
            Vehicle v = new Car();
            v.start();
      }
      
      /*
      
      In the above example, Journey and Car objects are loosely coupled. It means Vehicle is an interface and we can inject any of the implemented classes at run time and we can provide service to the end user.

      The examples of Loose coupling are Interface, JMS, Spring IOC(Dependency Injection, it can reduce the tight coupling).

Advantages Of Loose coupling:-

       A loosely coupled will help you when your application need to change or grow. If you design with loosely coupled architecture, only a few parts of the application should be affected when requirements change. With too a tight coupled architecture, many parts will need to change and it will be difficult to identify exactly which parts will be affected. In short,

1) It improves the testability.                                                         
2) It helps you follow the GOF principle of program to interfaces, not implementations.
3) The benefit is that it's much easier to swap other pieces of code/modules/objects/components when the pieces are not dependent on one another.
4) It's highly changeable. One module doesn't break other modules in unpredictable ways.
*/
      
      
      
      
} 
