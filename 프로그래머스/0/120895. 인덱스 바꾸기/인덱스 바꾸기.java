class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();
        
        //문자열 바꾸기
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;
        
        String answer = new String(charArray);
        
        return answer;
    }
}