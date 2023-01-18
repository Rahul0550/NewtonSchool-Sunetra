import java.util.*;

class Array {
    public static void main(String[] args) {
        int[] array ={7,10,15, 22, 29};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<array.length; i++){
        if(array[i] == n)
        System.out.println(array[i]);
        }
    }
    
}
