public class Problem4 {
    public static void main(String[] args) {
        boolean found = false;
        long max, num1, num2; 
        num1 = -1; 
        num2 = -1;
        max = -1; 
        for (int i = 999; i > 99 && !found; i--) {
            for (int j = 999; j > 99 && !found; j--) {
                long num = i * j;
                long tempNum = num;
                long countNum = num;
                int count = 0;

                while (countNum != 0) {
                    countNum /= 10;
                    count++;
                }

                // System.out.println(count);

                int endLen = count / 2;
                // System.out.println(endLen);

                long endTrail = num % (int) Math.pow(10, endLen);
                num /= (int) Math.pow(10, endLen);

                if (count % 2 != 0)
                    num /= 10;
                long startTrail = num;
                long tempStartTrail = num;
                long revStartTrail = 0;

                for (int x = endLen - 1; x > -1; x--) {
                    revStartTrail += ((tempStartTrail % 10) * (int) Math.pow(10, x));
                    tempStartTrail /= 10;
                }

                if (endTrail == revStartTrail) {
                    // System.out.println(tempNum);
                    if(tempNum > max){
                        
                        max = tempNum;
                        num1 = i; 
                        num2 = j; 
                    }
                    break;
                }

            }
        }

        System.out.println(num1 + " * " + num2 + " = "  + max);
    }
}
