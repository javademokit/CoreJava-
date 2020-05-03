package com.builder.designp;

public class Stringreverse
{
	public static void main(String[] args)
	{
		System.out.println(reverse("shyam kumar yadav"));
		
		System.out.println("-----------");
		System.out.println(rev("shyam yadav"));
	}
	public static String reverse(String s)
	{
     
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2+=s.charAt(i);
		}
		return s2;
	}
	public static String rev(String s)
	{
		if(s==null||(s.length()<=1))
		{
			return s;
		}
			
		return rev(s.substring(1))+s.charAt(0);
	}

}
