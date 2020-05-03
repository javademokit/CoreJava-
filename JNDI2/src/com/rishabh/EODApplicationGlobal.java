/*-----------------------------------------------------------------------------------------------------
 **
 ** File Name  : EODApplicationGlobal.java
 **
 ** Module     : Maintenance
 ** 
 ** Created By : 1714

 -------------------------------------------------------------------------------------------------------
 CHANGE HISTORY
     
 Changed By          :  shyamlal yadav
 Changed Description :  DNS Bank jndi 
 Modified  Date      :
 Search String       :
     
 ------------------------------------------------------------------------------------------------------- 

 */
package com.rishabh;

import java.io.InputStream;
import java.util.Properties;
public final class EODApplicationGlobal {

    private EODApplicationGlobal(){
        
    }
    private static String EOD_JNDI_NAME;
    static 
    {
    	initialze();
    }
    public static void setEOD_JNDI_NAME(String EOD_JNDI_NAME) {
		EOD_JNDI_NAME = EOD_JNDI_NAME;
	}
	public static void initialze() {
        if(true){
        	System.out.println("Inside Loading Global variable properties");
            InputStream input = null;
            input = new EODApplicationGlobal().getClass().getResourceAsStream("/eod.properties");
                try{
                    Properties props=new Properties();
                    props.load(input);
                    EOD_JNDI_NAME=props.getProperty("EOD_JNDI_NAME");
                    System.out.println("jndi name----"+EOD_JNDI_NAME);
                    EODApplicationGlobal.setEOD_JNDI_NAME(props.getProperty("EOD_JNDI_NAME"));
                    
                }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
            finally
            {
              if (input != null) {
                try
                {
                  input.close();
                  input = null;
                }
                catch (Exception e)
                {
                	System.out.println("Exception Occured :"+e.getMessage());
                }
              }
            
            }
        }  
       
    }
    public static String getEOD_JNDI_NAME() {
        return EOD_JNDI_NAME;
    }
    public static void main(String[] args) {
    	initialze();
	}
    
    
}