public class twoSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int x = 13;
        System.out.println(TSum(arr, n, x));
    }
    public static int TSum(int arr[], int n, int x){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==x){
                    return (i, j);
                }
            }
        }
        return -1;
    }
}
