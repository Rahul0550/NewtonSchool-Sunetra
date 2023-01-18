import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class BoundaryTraversal {
    public static void main (String[] args) {
                      // Your code here
                      Scanner Sc=new Scanner(System.in);
                      int T=Sc.nextInt(); int i,j;
                      while (T!=0)
                      {
                      int m=Sc.nextInt();
                      int n=Sc.nextInt();
                      int array[][]=new int[m][n];

//for taking INPUT
                      for ( i=0;i<m;i++)
                      {
                          for( j=0;j<n;j++)
                          {
                          array[i][j] = Sc.nextInt();   
                         // System.out.println(array[i][j] + " "); 
                          }
                      }
//............INPUT ends here


//Output work..................................->
//(First row and last column)
                      for ( i = 0; i < m; i++) {
            for ( j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print(array[i][j] + " ");

                else if (j == n - 1)
                    System.out.print(array[i][j] + " ");
               
            }           
        }
//(last row and first column).......
        for ( i = m-1; i >=0; i--) {
            for ( j = n-2; j >=0; j--) {
                if (i == m-1 && i!=0)
                    System.out.print(array[i][j] + " ");
               
                else if (j == 0 && i!=0)
                    System.out.print(array[i][j] + " ");
                
            }
           
        }
         System.out.println();T--;
                          }
                          

                            
    }
}