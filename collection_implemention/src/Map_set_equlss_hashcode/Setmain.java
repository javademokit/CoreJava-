package Map_set_equlss_hashcode;

import java.util.HashSet;
import java.util.Set;

public class Setmain
{
	public static void main(String args[])
	{
		
	HashSet<Emp_set>st=new HashSet<Emp_set>();
	
	Emp_set e=new Emp_set(1,"shyam");
	Emp_set e1=new Emp_set(1,"shyam");
	
	st.add(e);
	st.add(e);
	System.out.println(st);
	System.out.println(st.size());

	
	}

}
