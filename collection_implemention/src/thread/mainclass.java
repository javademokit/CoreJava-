package thread;

class Printoddeven{

    public synchronized void print(String msg) {
        try {
            if(msg.equals("Even")) {
                for(int i=0;i<=10;i+=2) {
                    System.out.println(msg+" "+i);
                    Thread.sleep(2000);
                    notify();
                    wait();
                }
            } else {
                for(int i=1;i<=10;i+=2) {
                    System.out.println(msg+" "+i);
                    Thread.sleep(2000);
                    notify();
                    wait();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class PrintOdd extends Thread{
    Printoddeven oddeven;
    public PrintOdd(Printoddeven oddeven){
        this.oddeven=oddeven;
    }

    public void run(){
        oddeven.print("ODD");
    }
}

class PrintEven extends Thread{
    Printoddeven oddeven;
    public PrintEven(Printoddeven oddeven){
        this.oddeven=oddeven;
    }

    public void run(){
        oddeven.print("Even");
    }
}



public class mainclass 
{
    public static void main(String[] args) {
        Printoddeven obj = new Printoddeven();//only one object  
        PrintEven t1=new PrintEven(obj);  
        PrintOdd t2=new PrintOdd(obj);  
        t1.start();  
        t2.start();  
    }
}