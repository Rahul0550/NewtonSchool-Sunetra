import java.util.*;
public class Missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enter the value: ");
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        //int[] arr = {5, 6, 7, 1 ,2 , 3,4};
        //int n = arr.length;
        //Arrays.sort(arr);
        for(int i=0; i<l-1; i++){
            
                if((arr[i])+1 != arr[i+1]){
                    System.out.print((arr[i])+1);
            }
            else
                    System.out.print(" ");
        
    }
}
}
