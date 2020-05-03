package array;

public class swapoddtoeven {
	public static void main(String args[])
	{
		int []x={1,2,3,4,5,6,7,8,9};
		int temp=0;
		for(int i=0;i<x.length-1;i+=2)
		{
			temp=x[i];
			x[i]=x[i+1];
			x[i+1]=temp;
		}
		System.out.print("after swap odd to even");
		for(int j=0;j<x.length;j++)
		{
			System.out.println(x[j]);
		}
	}

}
