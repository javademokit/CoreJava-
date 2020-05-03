package StackAlgoritham;
public class Stack
{
static final int MAX = 1000;
int top;
int []a = new int[MAX];


boolean isEmpty()
{
	return(top<0);
	
}


boolean push(int x)
{
	if(top >= (MAX-1))
	{
		System.out.println("stack overflow");
		return false;
	}
	else
	{
		a[top++] = x;
		System.out.println("pushed element :"+x);
		return true;
	}
}
	int pop()
	{
		if(top<0)
		{
			System.out.println("stack overflow");
      return 0;
		}
		else {
			int x = a[top--];
			
			return x;
		}
	}
	
	int peek()
	{
		if(top<0)
		{
			System.out.println("stack overflow");
             return 0;
		}
		else
		{
			int x=a[top];
			return x;
		}
	}
	
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		
		System.out.println(s.peek());
		

	}
		
	}




