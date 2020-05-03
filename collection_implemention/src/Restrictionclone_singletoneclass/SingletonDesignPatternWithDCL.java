package Restrictionclone_singletoneclass;

public class SingletonDesignPatternWithDCL {
	
    private static volatile SingletonDesignPatternWithDCL INSTANCE;
    private SingletonDesignPatternWithDCL() {
    }
    
    
    public static SingletonDesignPatternWithDCL getInstance() {
        if(null == INSTANCE){
            synchronized (SingletonDesignPatternWithDCL.class) {
                if(null == INSTANCE){
                    INSTANCE = new SingletonDesignPatternWithDCL();
                }
            }
        }
        return INSTANCE;
    }
    
    
    
    public static void main(String[] args)
	{
		Thread t1=new Thread()
				{
			
			public void run()
			{
				SingletonDesignPatternWithDCL sb =SingletonDesignPatternWithDCL.getInstance();
				System.out.println(sb.hashCode());
			}
			
			};

			Thread t2=new Thread()
					{
				
				public void run()
				{
					SingletonDesignPatternWithDCL sb1 =SingletonDesignPatternWithDCL.getInstance();
					System.out.println(sb1.hashCode());
				}
				
				};
				 t1.start();
				 try
				{
					t1.join(1000);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  t2.start();
	}
}
 
