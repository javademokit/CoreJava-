package Railwaytrack;

import JOIN_Thread.Thraed1;

public class Railwaystationmonitersingletrain
{
int a=0;
    public synchronized int station(String msg) {
    	
    	
        try {
            if(a==0) {
                
            
                    System.out.println("train hase gone"+msg);
                    Thread.sleep(100);
                    notify();
                    wait();
               
            } else {
                
                    System.out.println("train came at station "+msg);
                    Thread.sleep(100);
                    notify();
                    wait();
              a=0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        a=1;
		return 0;
    }

		 
		 
		 
	 }
	

