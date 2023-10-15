// Vyasa Aiyer 
// Problem 2
// 15/10/2023
public class Problem2 {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 1;
        int end = 4000000;
        int sum = 0;
        while (n2 <= end) {
            if (n2 % 2 == 0) {
                sum += n2;
            }
            int temp = n1;
            n1 = n2;
            n2 += temp;
        }

        System.out.println(sum);
    }
}