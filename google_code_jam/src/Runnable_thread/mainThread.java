package Runnable_thread;
/*Defining a thread*/
class Runnablethread implements Runnable{
/* job of the thread*/
public void run(){
for(int i=0; i<10; i++){
System.out.println("Child Thread");
}
}
static class mainThread{
/* job of main thread*/
public static void main(String args[ ]){
Mythread rt = new Mythread(); /* main thread created the runnable object*/
Thread t = new Thread(rt); /*main thread creates child thread and passed the runnable object*/
t.start();
for(int i=0; i<10; i++){
System.out.println("Main Thread");
}
}}}
