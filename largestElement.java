import java.util.*;

public class largestElement {
    public static void main(String[] args) {
        //int arr[] ={5,7, 9, 14,2};
        Scanner sc = new Scanner(System.in);
        
//intup statement...
System.out.println("enter number of variables");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("enter numbers");
            arr[i]=sc.nextInt();
        }
//input statement ends here...
        for(int i=0; i<n-1; i++){
            int current =arr[i];
            int j;
            for(int j=i-1; j>=0;j--){
                if(current>arr[j]){
                    arr[j+1] = arr[j];
                }
                else
                    break;
            }
            
        }
        System.out.println(arr[j]);
    }
    
}
