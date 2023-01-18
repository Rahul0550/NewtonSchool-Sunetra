class CompareTo {
    static int compare(String s1, String s2){
        for(int i=0; i<s1.length() && i<s2.length(); i++){
            if((int) s1.charAt(i) == (int) s2.charAt(i)){
                continue;
            }
            else{
                return (int) s1.charAt(i) - (int) s2.charAt(i);
            }
        }
        if(s1.lengh()== s2.length()){
            
        }
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 ="hello";
        String s3 = "meklo";
        String s4 = "hemlo";
        String s5 = "flag";
        String s6 = "helloWorld";
        String s7 = "hell";
        System.out.println(compare(s1,s2));
        System.out.println(compare(s1,s3));
        System.out.println(compare(s1,s4));
        System.out.println(compare(s1,s5));
        System.out.println(compare(s1,s6));
        System.out.println(compare(s1,s7));
    }
}
