public class Problem9 {
    public static void main(String[] args) {
        /*
         * a^2 + b^2 = c^2 
         * a<b<c
         * a+b+c = 1000
         * 
         * 
         */
        for(int c = 1000; c > 0; c--){
            for(int b = c-1 ; b > 0; b--){
                for(int a =b -1;a > 0; a--){
                    // if(a*a + b*b == c*c) System.out.println(a + " " + b +  " " + c);
                    if(a + b + c == 1000 && a*a + b*b == c*c) System.out.println(a + " " + b +  " " + c + "\n" +(a*b*c)); 
                }
            }
        }
    }
}
