public class ClearBit {
    public static void main(String[] args) {
        int i = 17;
        int pos = 4;
        int Bitmask = 1<<pos;
        int not = ~(Bitmask);
        int number = not & i;
        System.out.println(number); 

    }
}
