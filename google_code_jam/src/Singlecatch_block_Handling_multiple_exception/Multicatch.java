package Singlecatch_block_Handling_multiple_exception;

public class Multicatch
{
	public static void main(String[] args)
	{
		try
		{
			String s = "FOOBAR";
            int i = Integer.parseInt(s);
		}
		catch(ArithmeticException | NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
