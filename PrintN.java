import java.util.*;

public class PrintN {
   
    static void printNumbers(int n){
        if(n==0)
            return;

        System.out.print(n +" ");
        printNumbers(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here: ");
        int n = sc.nextInt();
        printNumbers(n);
    }
}

