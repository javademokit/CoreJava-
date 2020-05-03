package Anonymus_innerclass;
//Java program to illustrate creating an immediate thread
//Using Anonymous Inner class that extends a Class
class MyThread 
{
  public static void main(String[] args)
  {
      //Here we are using Anonymous Inner class
      //that extends a class i.e. Here a Thread class
      Thread t = new Thread()
      {
          public void run()
          {
              System.out.println("Child Thread");
          }
      };
      t.start();
      System.out.println("Main Thread");
  }
}