class SumN {
    static int sumn(int n){
        if (n==1){
            return 1;
        }
        return n + sumn (n-1);
    }
    public static void main(String[] args) {
        int n =10;
        System.out.println( sumn(n));
    }
    
}
