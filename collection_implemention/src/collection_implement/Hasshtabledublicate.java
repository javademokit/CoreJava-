package collection_implement;

import java.util.Hashtable;
import java.util.Map.Entry;

class Employe1
{
	int id;
	String name;
	Employe1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class Hasshtabledublicate
{
	public static void main(String[] args)
	{
			
	Hashtable<Integer,String>ls=new Hashtable<Integer,String>();
	
	ls.put(1, "shyam");
	ls.put(1, "shyam");
	ls.put(1, "shyam");
	ls.put(1, "shyam");
	//ls.put(null, null);// runtime exception it's give 
	System.out.println(ls);
	System.out.println(ls.size());
	
	System.out.println("------------object class");
	
	Hashtable<Integer,Employe1>lsp=new Hashtable<Integer,Employe1>();

	Employe1 e1=new Employe1(1,"shyam");
	Employe1 e2=new Employe1(1,"shyam");
	Employe1 e3=new Employe1(1,"rishabh");
	Employe1 e4=new Employe1(1,"rohan");
	lsp.put(1, e1);// key is same----// make diff
	lsp.put(2, e2);
	lsp.put(3, e3);
	lsp.put(4, e4);
	System.out.println(lsp.size());
	

	for(Entry<Integer, Employe1>la:lsp.entrySet())
   {
     System.out.println(la.getKey()+":"+  la.getValue().id+ ";"+la.getValue().name);
   
  }
	
	
	}
}
