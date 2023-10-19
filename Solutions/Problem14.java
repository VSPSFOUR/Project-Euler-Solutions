import java.util.Hashtable;

public class Problem14 {
    public static void main(String[] args) {
        long currentTerm = -1;
        long maxNumber = -1;
        

        java.util.Hashtable<Long, Integer> chainLenTable = new Hashtable<>(); 

        int chainLen = 1;
        int maxChainLen = 1;
        
        for(int i = 1; i < 1000001; i++){
            currentTerm = (long) i; 
            chainLen = 1; 

            while(currentTerm!= 1){
                if(currentTerm% 2 == 0 ){
                    currentTerm/= 2;

                }else{
                    currentTerm = 3*currentTerm +1;
                }
                if(chainLenTable.containsKey(currentTerm)){
                    chainLen += chainLenTable.get(currentTerm) -1;
                    break; 

                }
                chainLen++; 

            }
            // System.out.println(chainLen);
            if(chainLen > maxChainLen){
                maxChainLen = chainLen;
                maxNumber = i;

            }


        }

        System.out.println(maxChainLen + " " + maxNumber);
        
    }
}
