class Solution {
    public int[] solution(int n) {
        int[] answer = new int [n];
        int first = n;
        int i=0;
            for(int j=2; j<=first; j++){
             if (first % j == 0) {         
                answer[i] = j;            
                i++;                     
                while (first % j == 0) {  
                    first /= j;
                }
            }
        }
        int[] result = new int [i];
        for(int k=0; k<i; k++){
            result[k] = answer[k];
        }
        return result;
    }
}