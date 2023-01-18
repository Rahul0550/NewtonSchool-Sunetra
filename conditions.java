import java.util.*;
//import java.util.Scanner; (only for scanner)
public class conditions {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        }  else if (a>b){
            System.out.println("a is greater");
        } else {
            System.out.println("a is lesser");
        }
       }
    }*/
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum= 0;
   // System.out.printf("Hello! Welcome Back %c"+name);
   for(int i=0; i<=n; i++){
    //System.out.println(sum + i);
    sum = sum + i;
   }
   System.out.println(sum);
}
}
    
        
