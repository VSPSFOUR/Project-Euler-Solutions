public class Problem10 {
    public static void main(String[] args) {
        long sum = 0;
        int limit = 2000000;

        long start = System.nanoTime();

        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                // System.out.println(i);
                sum += i;

            }
        }
        long end = System.nanoTime();

        System.out.println(end - start +
                " ns");

        System.out.println(sum);
    }

    private static boolean isPrime(int num) {
        if (num == 2)
            return true;

        for (int i = (int) Math.sqrt(num) + 1; i > 1; i--) { // remeber limit is sqrt(num) +1 for prime num check
            if (num % i == 0)
                return false;
        }

        return true;
    }
}