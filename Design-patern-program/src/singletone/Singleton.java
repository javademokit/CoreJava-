package singletone;
import java.lang.reflect.Constructor;

public class Singleton {
	 
    private static Singleton instance = null;

   /* private Singleton() {

    }*/
    private Singleton() throws Exception {
        if (instance != null) {
                   throw new RuntimeException("Instance already exists");
        }
 }

    public static Singleton getInstance() throws Exception {
            if (instance == null) {
                     synchronized (Singleton.class) {
                                if (instance == null) {
                                        instance = new Singleton();
                                }
                     }
             }
             return instance;
     }
    
    public static void main(String[] args) throws Exception {
        
        Singleton objOne = Singleton.getInstance();
        Singleton objTwo = null;
        try {
               Constructor constructor = Singleton.class.getDeclaredConstructor();
               constructor.setAccessible(true);
               objTwo = (Singleton) constructor.newInstance();
         } catch (Exception ex) {
                  System.out.println(ex);
         }

         System.out.println("Hashcode of Object 1 - "+objOne.hashCode());
         System.out.println("Hashcode of Object 2 - "+objTwo.hashCode());
}

    
}
