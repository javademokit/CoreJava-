package final_object;

class mysingleton1{

private mysingleton1(){}
public static final mysingleton1 instance= new mysingleton1();

    public static mysingleton1 getInstance(){

        return instance;

    }
    
    public static void main(String[] args) {
     
     
     for(int i=0;i<=5;i++){
        
      mysingleton1 s= mysingleton1.getInstance();
      
      System.out.println(s);
     }
  
 }
}