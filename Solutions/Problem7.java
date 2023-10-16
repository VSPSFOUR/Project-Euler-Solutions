public class Problem7 {
    public static void main(String[] args) {

        int nthTerm = 10001;

        if (nthTerm == 1) {
            System.out.println(2);
        } else {
            int currentTerm = 1;
            int currentPrime = 2;

            int i = 1;
            int n;
            while (currentTerm < nthTerm) {
                n = 2 * i + 1;

                if (isPrime(n)) {
                    currentPrime = n;
                    currentTerm++;
                }

                i++;


            }
            System.out.println(currentPrime);
        }


        // for(int i = 2 ; i < 50; i ++){
        //     if(isPrime(i)){
        //         System.out.println(i);
        //     }
        // }
    }

    private static boolean isPrime(int n) {

        for(int i = (int) Math.sqrt(n); i > 1; i--){
            if(n % i  == 0) return false;
        }
    return true;

    }
}
