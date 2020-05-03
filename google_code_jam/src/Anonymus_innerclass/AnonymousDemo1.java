package Anonymus_innerclass;
//Java program to demonstrate Anonymous inner class
interface Aged
{
  int x = 21;
  void getAge();
}
class AnonymousDemo1
{
  public static void main(String[] args) {

      // Myclass is hidden inner class of Age interface
      // whose name is not written but an object to it 
      // is created.
      Aged oj1 = new Aged() {
          @Override
          public void getAge() {
              
              System.out.print("Age is "+x);
          }
      };
      oj1.getAge();
  }
}