class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for(int i=0;i<my_string.length();i++){
           // if(letter!=my_string.charAt(i)){
            //String과 char는 타입이 달라서 비교 못함!!!!!!!!!!!!
            
                if(letter.charAt(0)!=my_string.charAt(i)){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}