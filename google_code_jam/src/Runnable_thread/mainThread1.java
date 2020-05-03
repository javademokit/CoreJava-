package Runnable_thread;
/*Defining a thread*/
class Mythread extends Thread{
/* job of the thread*/
public void run(){
for(int i=0; i<10; i++){
System.out.println("Child Thread");
}
}
static class mainThread1{
/* job of main thread*/
public static void min(String args[ ]){
Mythread mt = new Mythread(); /* main thread created the child thread*/
mt.start();
for(int i=0; i<10; i++){
System.out.println("Main Thread");
}
}
}}
