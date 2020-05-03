 package Anonymus_innerclass;

//Java program to illustrate defining a thread
//Using Anonymous Inner class that define inside argument
class  MyThread2
{
  public static void main(String[] args)
  {
      //Here we are using Anonymous Inner class
      //that define inside argument, here constructor argument
      Thread t = new Thread(new Runnable()
      {
          public void run()
          {
              System.out.println("Child Thread");
          }
      });
       
      t.start();
       
      System.out.println("Main Thread");
  }
}

/*

Like local classes, anonymous classes can capture variables; they have the same access to local variables of the enclosing scope:

An anonymous class has access to the members of its enclosing class.
An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final.
Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other declarations in the enclosing scope that have the same name.
Anonymous classes also have the same restrictions as local classes with respect to their members:

We cannot declare static initializers or member interfaces in an anonymous class.
An anonymous class can have static members provided that they are constant variables.
Note that you can declare the following in anonymous classes:

Fields
Extra methods (even if they do not implement any methods of the supertype)
Instance initializers
Local classes
However, constructors can not be declared in an anonymous class.

This article is contributed by Nishant Sharma and Bishal Kumar Dubey. If you like GeeksforGeeks and would like to contribute, you can also write an article using contribute.geeksforgeeks.org or mail your article to contribute@geeksforgeeks.org. See your article appearing on the GeeksforGeeks main page and help other Geeks.

Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

*/