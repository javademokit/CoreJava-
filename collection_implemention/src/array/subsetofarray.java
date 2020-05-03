package array;

public class subsetofarray
{
public static void main(String[] args)
{
 
	int [] arr={1,2,3,4,5};
	int n=arr.length;
    for (int i = 0; i < (1<<n); i++)
    {
        System.out.print("{ ");

        // Print current subset
        for (int j = 0; j < n; j++)

            if ((i & (1 << j)) > 0)
                System.out.print(arr[j] + " ");

        System.out.println("}");
    }
	}
	
	
	
}

