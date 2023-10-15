public class Problem3 {
    public static void main(String[] args) {

        // long number = 600851475143l;
        long number = 13195;

        long sqrtNum = (long) Math.sqrt(number) ;
        long max = 0;


        if (number % 2 == 0){
            max = 2;
            number /= 2;
        }

        long i = max;
        long oddNum = 2 * i + 1;



        while (oddNum <= sqrtNum) {


            if (number % oddNum == 0) {

                if (oddNum > max) {
                    max = oddNum;
                    number /= oddNum;
                }
            }
            i++;
            oddNum = 2 * i + 1;
        }


        System.out.println(max);
    }
}
