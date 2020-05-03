/*@Authore:shyamlal yadav
*/
package Restrictionclone_singletoneclass;
import java.io.ObjectStreamException;
import java.io.Serializable;
public class SingletonDesignPatternInMultiThreadedEnvironment implements Serializable, Cloneable{
    private static volatile SingletonDesignPatternInMultiThreadedEnvironment INSTANCE;
    private SingletonDesignPatternInMultiThreadedEnvironment() 
    {
 
    }
    
    public static SingletonDesignPatternInMultiThreadedEnvironment getInstance() {
        synchronized (SingletonDesignPatternInMultiThreadedEnvironment.class) {
            if(null == INSTANCE){
                INSTANCE = new SingletonDesignPatternInMultiThreadedEnvironment();
            }
            return INSTANCE;
        }
    }
    private Object readResolve() throws ObjectStreamException {
/*//    	throws ObjectStreamException
*/        return INSTANCE;
        
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	
	return super.clone();
       //throw new CloneNotSupportedException();
    }
    public static void main(String[] args) throws ClassNotFoundException
	{
    	SingletonDesignPatternInMultiThreadedEnvironment  sb=SingletonDesignPatternInMultiThreadedEnvironment.getInstance();
    	System.out.println(sb.hashCode());
    	try
		{
			SingletonDesignPatternInMultiThreadedEnvironment sb1=(SingletonDesignPatternInMultiThreadedEnvironment)sb.clone();
			
			System.out.println(sb1.hashCode());
		} catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}