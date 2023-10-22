public class Problem16{
    public static void main(String[] args) {
        

/*
 * 2^4 = 2*2*2*2 -> (2 +2) *2^2
 * 
 *      = 4 *2*2 -> (4+4) * 2
 *      = 8 * 2  -> (8+8)
 */
        String num = strPowerTwo(1000);
        long sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += Long.parseLong("" + num.charAt(i));
        }

        System.out.println(sum);

    }



    public static String strPowerTwo(int exp){
        String base = "2"; 
        
        while(exp != 1){
            base = sum(doubleArray(base));
            exp--; 
        }
        return base;


    }




    private static String[] doubleArray(String num){
        String[] array = {num, num};
       return array;
        

        
    }
    public static String sum(String[] numArray) {

        // Only works if all strings are the same length and valid charaters (int only)
        long columnSum = 0;
        
        long remainder = 0;
        String total = "";
        for(int col = numArray[0].length()-1 ; col > -1; col --){
            columnSum = remainder;
            // remainder = 0; 
            for(String num: numArray){
                columnSum += Long.parseLong("" + num.charAt(col));
            }

            total = columnSum%10 + total; 
            remainder = (long) columnSum /10; 

        }

        if(remainder != 0) total = remainder + total; 

        


        return total;

    }

}


