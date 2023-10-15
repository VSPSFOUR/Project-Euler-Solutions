public class Problem6 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0; 
        int sqSum = 0;
        for(int i = 1; i < n +1; i ++){
            sum +=  i; 
            sqSum += i * i; 

        }

        System.out.println(sum * sum - sqSum);


    }
}
