class Solution {
    public String solution(String my_string) {
        String answer [] = new String[my_string.length()];
        
        for(int i=0;i<my_string.length();i++){
            answer[i]=String.valueOf(my_string.charAt(my_string.length()-1-i));
        }
        //return answer;
        //이렇게 반환하면 결괏값이 ["n","o","r","a","j"] 로 나옴
        
        //문자열 합치는 메서드를 쓰자
        
        return String.join("",answer);
        //""부분은 구분자를 뜻함
    }
}