package array;

public class Unique_single_element
{
	public static void main (String[] args) 
    { 
    int arr[] = { 9, 4, 9, 6, 7, 4 }; 
       int n = arr.length; 
    
       for (int i = 0; i < n; i++) 
       { 
           int j; 
           for (j = 0; j < n; j++) 
               if (i != j && arr[i] == arr[j]) 
                   break; 
           if (j == n) 
              System.out.println( arr[i]); 
       } 
         
       System.out.println(); 
   }
	
	/*
	 int num[]={1,2,5,4,1,2,3,5};
     for(int i =0;i<num.length;i++)
     {
         boolean isDistinct=false;
         for(int j=0;j<i;j++)
         {
             if(num[j]==num[i])
             {
                 isDistinct=true;
                 break;
             }
         }
         if(!isDistinct)
         {
             System.out.print(num[i]+" ");
         }
     }
    }*/
	
	
}
