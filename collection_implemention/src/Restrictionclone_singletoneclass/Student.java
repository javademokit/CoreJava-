package Restrictionclone_singletoneclass;

import java.io.ObjectStreamException;
import java.io.Serializable;

import thread.mainclass;
 
public class Student implements Serializable, Cloneable {
 
    private volatile static Student INSTANCE = new Student();
 
    private Student() {
       
    }
 
    public static Student getInstance(){
        return INSTANCE;
    }
 
    /**
     * This two method will restrict two copy of the object ---
     * @return
     * @throws ObjectStreamException
     */
   private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
 
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //throw new CloneNotSupportedException();
        return super.clone();
        
    }
 
    
    public static void main(String[] args)
	{
    	
    	for(int i=0;i<10;i++)
    	{
    	Student student=Student.getInstance();
    	
    	System.out.println("origanal-->"+student.hashCode());
    	
      	Student student2;
      	
        try 
        {
        	Student test2 = (Student) student.clone();
            
        	System.out.println("copy-->"+test2.hashCode());

        } catch (CloneNotSupportedException e) {
           
            e.printStackTrace();
        }
    	
    	
    	}
    	
	}
    
    
    
}
 