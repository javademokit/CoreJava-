package array;

public class oneshift {
	public static void main(String args[])
{
	int x[]={1,2,3,4,5,6,7,8,9};
	for(int i=x.length-1;i>1;i--)
	{
		x[i]=x[i-1];
		
		
	}
	for(int i=0;i<x.length;i++){
		System.out.println(x[i]);
	}
}

}
