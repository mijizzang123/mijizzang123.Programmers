import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        //정렬을 먼저 하고, for문 돌려서 repeat값이 1인 애들을 answer에 받자
        String answer = "";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sorteds = new String(charArray);
        
        for(int i=0;i<sorteds.length();i++){
            int repeat = 0;
            for(int j=0; j<sorteds.length();j++){
                if(i !=j && sorteds.charAt(i)==sorteds.charAt(j)){
                    repeat++;
                }
            }
                if(repeat==0){
                    answer+=sorteds.charAt(i);
                }
            }
        
      
        return answer;
    }
}