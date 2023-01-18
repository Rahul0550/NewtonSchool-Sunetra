import javax.sound.sampled.SourceDataLine;

public class Day1 {
    public static void main(String agrs[]){
        // 
        int[] arr = {2,3,5,8,9};
        int k = 13;
        int n = arr.length;
        int i = 0;
        int j = n -1;
        while (i<j){
            if (arr[i] + arr [j] == k)
            System.out.println(arr[i]+" " + arr[j]);
            break;
        }
        else if (arr[i] + arr [j] < k)
            i++;
        else 
            j--;
    }
    System.out.println("0");
}
