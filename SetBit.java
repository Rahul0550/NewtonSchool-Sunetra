import java.util.*;

public class SetBit {
    public static void main(String[] args) {
        int n = 15;
        int pos = 3;
        int mask = 1<<pos;

        int newno = mask | n;
        System.out.println(newno);
    }
    
}
//1111
//8+4+2+1=15