package Array2D;

//Java program to calculate the sum 
//of upper and lower triangle

class sum_of_right_trangle_right_tangle
{
 /*function to calculate sum*/
 static void sum(int mat[][], int r, int c)
 {
     int i, j;
     int upper_sum = 0;
     int lower_sum = 0;
      
     /*calculate sum of upper triangle*/
     for (i = 0; i < r; i++)
         for (j = 0; j < c; j++) 
         {
             if (i <= j) 
             {
                 upper_sum += mat[i][j];
             }
         }
  
     System.out.println("Upper sum is " + upper_sum);
      
     /*calculate sum of lower*/
     for (i = 0; i < r; i++)
         for (j = 0; j < c; j++) 
         {
             if (j <= i) 
             {
                 lower_sum += mat[i][j];
             }
         }
  
     System.out.print("Lower sum is " + lower_sum);
 } 
      
 // Driver code
 public static void main (String[] args)
 {
     int r = 3;
     int c = 3;
  
     /*giving the matrix*/
     int mat[][] = {{ 6, 5, 4 },
                     { 1, 2, 5 },
                     { 7, 9, 7 }};
                      
     /*calling the function*/
     sum(mat, r, c);
 }
}
