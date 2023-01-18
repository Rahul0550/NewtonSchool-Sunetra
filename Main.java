import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 0; i<n; i++){
            int a = sc.nextInt();
            int[] arr = new int [a];
            int first = 0;
            int second = 0;
            int third = 0;
        for( int j=0 ; j<a ; j++)
            arr[j] = sc.nextInt();

            int j;
            if(arr[j]>first){
                third = second;
                second = first;
                first = arr[j];
            }
            else if (arr[j] > second){
                third = second;
                second = arr[j];
            }
            else if (arr[j] > third){
                third = arr[j];
            }
        }
        System.out.println(first + " " + second + " " + third);
    }
}



















// public class Main{
//     public static void main(String[] args){
//         int x = 400;
//         long y = 102345678909L;
//         boolean z = true;
//         char c = 'D';
//         char d = 'd';
//         System.out.println(x);
//         System.out.println(c);
//         System.out.println(y);
//         System.out.println(z);
//         System.out.println(d);
//      System.out.print("Hello \nWorld !\n");
//      System.out.println("Hello World !");
//     }
// }