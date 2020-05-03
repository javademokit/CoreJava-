package com.rishabh;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/*-----------------------------------------------------------------------------------------------------
 **
 ** File Name  : EODConntectionFactory.java
 **
 ** Module     : Maintenance
 **
 ** Reason     : EODConnectionFactory class helps to get the pooled connection of Datasources, whenever its required. It reduces the time consumption for 
 **              for Creating a new connection
 ** 
 ** Created By : 1714

 -------------------------------------------------------------------------------------------------------
 CHANGE HISTORY
     
 Changed By          :  shyamlal yadav
 Changed Description :  
 Modified  Date      :
 Search String       :
     
 ------------------------------------------------------------------------------------------------------- 

- */

public class EODConnectionFactory
{
 private EODConnectionFactory(){
 }

public static Connection traceCon=null;
private static Connection fcCon=null;
private static Connection EODCon=null;

/*
 * Helps to get the Initialized instance of Pooled Connections 
*/
 
 public static EODConnectionFactory getInstance(){
    EODConnectionFactory cpm=new EODConnectionFactory(); 
    return cpm;
 }
 
 String  sname=null;
 
 
 
 
 public synchronized static Connection getEODConnectionFromPool()
 {
     try {
         if(EODCon==null || EODCon.isClosed()){
             try
             {
            	 System.out.println("try block----");
                 Context context = new InitialContext();
                 DataSource ds = (DataSource) context.lookup(EODApplicationGlobal.getEOD_JNDI_NAME());
                 EODCon= ds.getConnection();
                 System.out.println("Connection: "+EODCon);
             }
             catch(SQLException sqle)
             {
                 System.out.println("SQLException: "+sqle.getMessage());
                 sqle.printStackTrace();
                 return null;
             }  catch (NamingException ex) {
            	  System.out.println(ex.getMessage());
             }
         }
         
         System.out.println("connection established-----------------");
         return EODCon;
     } catch (SQLException ex) {
         java.util.logging.Logger.getLogger(EODConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println(ex);
     }
     
     
     return null;
 }
 
 
 public String message()
 {

     try
     {
      
     Connection con=EODConnectionFactory.getEODConnectionFromPool();
     
     Statement stmt=con.createStatement();
    
     
 
       
       
    String s2 = "select email from emp212";
    ResultSet rs = stmt.executeQuery(s2);
    System.out.println("select all record ");
    while(rs.next()){
       
         sname = rs.getString(1);
       

       
     
       
    }

  
     
     }
     catch(Exception e)
     {
         e.printStackTrace();
     
     }
 
	return sname;
	 
 }
 
 
 
 
 

}