package globalvariable;

public class A
{
static	int arr2[];//runtie exception

public static void main(String[] args)
{
	//System.out.println(arr2[0]);//nullpointerexce
	// 
	//System.out.println(arr2.length);// run time error
	char ch1='\101';
	System.out.println(ch1);
	int a='\101';
	System.out.println(a);
	int b=101;
	System.out.println(b);
	//int_a=9898;//c.E
	int _c=12;
	char ch =//empty not allow
	0;
	System.out.println(ch);
	int arr1[]=new int[2];
	System.out.println(arr1.length);
}
}
