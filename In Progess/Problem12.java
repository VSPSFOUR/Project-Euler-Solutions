public class Problem12 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int reqDiv = 500;
        int currentDiv = 5;
        // int n1 = 1;
        int sum = 28;
                int n2 = sum + 1;

        while (currentDiv < reqDiv) {
            // System.out.println(sum);
            currentDiv = countDivsors(sum);

            if (currentDiv > reqDiv)
                break;
            int temp = n2 + 1;

            sum += n2;
            n2 = temp;
        }

        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
        ;

    }

    private static int countDivsors(int num) {
        if (num == 1)
            return 1;
        int count = 2;
        if(num % 2 == 0) count ++; 
        // if(num % 3 == 0) count ++; 
        for (int i = 3; i <num /2+1 ; i++) {
            if (num % i == 0) {

                count++;
            }
        }
        // System.out.println(num + " : " + count);
        return count;

    }
}
