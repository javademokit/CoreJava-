package Anonymus_innerclass;
//Java program to demonstrate need for Anonymous Inner class
interface Age
{
  int x = 21;
  void getAge();
}
class AnonymousDemo
{
  public static void main(String[] args) 
  {
      // Myclass is implementation class of Age interface
      MyClass obj=new MyClass();

      // calling getage() method implemented at Myclass
      obj.getAge();     
  }
}

//Myclass implement the methods of Age Interface
class MyClass implements Age
{
  @Override
  public void getAge() 
  {
      // printing the age
      System.out.print("Age is "+x);
  }
}
