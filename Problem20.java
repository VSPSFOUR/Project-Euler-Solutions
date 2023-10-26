public class Problem20 {
    public static void main(String[] args) {



        System.out.println(sumStringCharacters(factorial(100)));
    }

    public static int sumStringCharacters(String string){
        int sum = 0;
        for(int i = 0; i < string.length(); i++){
            sum += Integer.parseInt("" + string.charAt(i));
        }
        return sum;
    }
    public static String factorial(int number) {
        String factorial = "" + number;
        for (int i = number - 1; i > 0; i--) {
            factorial = multiply(factorial, i);
        }
        return factorial;
    }

    public static String multiply(int number1, int number2) {
        String[] numberArray = new String[number2];

        for (int i = 0; i < number2; i++) {
            numberArray[i] = "" + number1;
        }

        return sum(numberArray);

    }

    public static String multiply(String number1, int number2) {
        String[] numberArray = new String[number2];

        for (int i = 0; i < number2; i++) {
            numberArray[i] = number1;
        }

        return sum(numberArray);

    }

    private static String sum(String[] numberArray) {
        // All elements must be the same size
        String result = "";
        long remainder = 0l;
        for (int i = numberArray[0].length() - 1; i > -1; i--) {
            long sum = remainder;

            for (String s : numberArray) {
                sum += Long.parseLong("" + s.charAt(i));
            }

            result = sum % 10 + result;

            remainder = (long) sum / 10;

        }
        if (remainder != 0)
            result = remainder + result;
        return result;
    }
}
