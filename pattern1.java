public class pattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
            int x = 0;
        for(i=0; i<=N; i++){
            for (int j=0; j<=N; j++) {
                System.out.print(x + 4*j +" ");
            }
            System.out.println();
            int x = x+6;
        }
    }
    
}
