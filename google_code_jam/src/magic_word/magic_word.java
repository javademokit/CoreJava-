package magic_word;

public class magic_word
{
	public static void main(String[] args)
	{
		String s="ab";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		char a=s.charAt(i);
		char b=s.charAt(i+1);
		int x=(int)a;   // casting data type
		int y=(int)b;  // casting data type
		System.out.println(x);
		System.out.println(y);
		if(y==x+1)
		{
			System.out.println("magic word");
			count=count+1;
			break;
		}
		}
		if(count==0)
		{
			System.out.println("not magic word");
		}
		
		
	}
}
