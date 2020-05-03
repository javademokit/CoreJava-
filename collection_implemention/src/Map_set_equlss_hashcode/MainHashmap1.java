package Map_set_equlss_hashcode;

import java.util.HashMap;
import java.util.Map;

public class MainHashmap1
{
public static void main(String[] args)
{
	//Map<Integer,Emp>m1=new HashMap<Integer,Emp>();
	Map<Emp,Integer>m2=new HashMap<Emp,Integer>();
	
    Emp e=new Emp(1,"shyam");
    Emp e1=new Emp(1,"shyam");
    m2.put(e, 1);
    m2.put(e1, 2);
    System.out.println(m2);
    System.out.println(m2.size());

    
    

    //{Map_set_equlss_hashcode.Emp@0=1, Map_set_equlss_hashcode.Emp@0=2}// custom hashcode 9/16 without euqalls
}
}
