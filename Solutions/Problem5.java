public class Problem5 {
    public static void main(String[] args) {
        
        int lcm = 1; 

        for(int i = 2; i < 20; i ++){
            lcm = lcm(lcm, i); 
        }


        System.out.println(lcm);
    }


    public static  int  factorial(int n){
        int product = 1; 
        for(int i = n ; i > 0; i--){
            product *= i; 
        }

        return product;
    }


    private static int gcd(int p, int q) 
    { 
        int r = -1; 

        while(r != 0){
            r = p %q;
            if(r == 0) break;
            p = q; 
            q = r; 

        }
        return q;
    } 
      
    private static int lcm(int p, int q) 
    { 
        return (p / gcd(p, q)) * q; 
    } 
}
