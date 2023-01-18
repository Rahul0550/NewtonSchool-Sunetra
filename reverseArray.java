public class reverseArray {
    static void reverse(int arr[], int n){
        int s=0;
        int e= n-1;
        int temp;
        while(s<e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        reverse(arr, n);
    }
}
