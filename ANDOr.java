import java.util.*;

public class ANDOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st Number");
        int res = sc.nextInt;
        int n = 3;
        int[] arr = new int[3];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt;
        }
        if(res%2 ==0){
            System.out.println(res & arr[0]);
        }
        else if(res %2 != 0){
            System.out.println(res | arr[1]);
        }
        else{
            System.out.println(0);
        }
    }
}
