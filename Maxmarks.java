import java.util.*;

public class Maxmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.print("a is greater");
                } 
            }
        } else if(b>c){
            if(b>d){
                System.out.print(" b is greater");
            }
        } else if(c>d){
            System.out.print(" c is greater");
        } else {
            System.out.print(" d is greater");
        }
    }
}


//int max = ( ( (P>Q) ? ((P>R) ? ((P>S)? P: S) )) ? ((Q>R) ? ((Q>S) ? Q:S)) ? ((R>S)? R : S));
