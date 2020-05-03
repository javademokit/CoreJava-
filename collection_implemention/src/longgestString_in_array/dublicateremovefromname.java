package longgestString_in_array;

import thread.mainclass;

public class dublicateremovefromname
{
	public static void main(String[] args)
	{
		String s="shyamamkumar";
		char []array=s.toCharArray();
		int size=array.length;
		for (int i = 0; i < size; i++) 
        {

            for (int j = i + 1; j < size; j++) 
            {


                if (array[i] == array[j]) 

                {
                    while (j < (size) - 1) 
                    {
                        array[j] = array[j + 1];
                        j++;
                    }   
                    size--;
                }
            }
        }
		
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]);
		}
		
	}

}
