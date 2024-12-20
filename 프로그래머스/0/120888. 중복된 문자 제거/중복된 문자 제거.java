class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<my_string.length();i++){
            char before = my_string.charAt(i);
            boolean isDuplicate = false;
            
            for(int j=0; j<answer.length(); j++){
                if(answer.charAt(j)==before){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                answer.append(before);
            }
            
        }
        return answer.toString();
    }
}