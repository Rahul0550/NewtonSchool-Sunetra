import java.util.*;

class TwoPointers{
    public static int isPairSum(int arr[], int n, int x){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(i ==j)
                    continue;
                if(arr[i]+arr[j] == x)
                    return 1;
                if(arr[i]+arr[j]>x)
                    break;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 8, 9, 10, 11};
        int val = 17;
        System.out.println(isPairSum(arr, arr.length, val));
    }
}