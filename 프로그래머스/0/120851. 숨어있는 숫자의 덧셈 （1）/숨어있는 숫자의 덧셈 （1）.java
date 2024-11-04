class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length();i++){
            char ch = my_string.charAt(i);
            if(ch >= '0' && ch <='9'){
                answer += ch - '0';
                // - '0' 이걸 해주라고!!!! 안그럼 아스키값으로 들어간다고!!!!!
            }
        }
        return answer;
    }
}