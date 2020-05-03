package ArraySearch_linear_index;
import java.util.Stack;
public class bracketbalance
{
	public static void main(String args[])
	{
		String s="{(a,b)}";
		System.out.println(balance(s));
	}
	public static  boolean balance(String s)
	{
		Stack<Character>st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='['||c=='('||c=='{')
			{
				st.push(c);
			}
			else if(c==']')
			{
				if(st.isEmpty()||st.pop()!='[')
				{
					return false;
				}
			}
			else if(c==')')
			{
				if(st.isEmpty()||st.pop()!='(')
				{
					return false;
				}
			}
			else if (c=='}')
			{
				if(st.isEmpty()||st.pop()!='}')
				{
					return false;
					
				}
			}
		}
		
		return st.isEmpty();
		
	}
}
