class Solution {
    public String solution(int age) {
        //StringBuilder로..풀면 너무 원초적인가ㅋㅋ..;
        String ageStr = String.valueOf(age); //int를 String으로 변환기
        StringBuilder answer = new StringBuilder();
        for(char c : ageStr.toCharArray()){
            if(c == '0'){
                answer.append('a');
            } else if(c =='1'){
                answer.append('b');
            } else if(c =='2'){
                answer.append('c');
            } else if(c =='3'){
                answer.append('d');
            } else if(c =='4'){
                answer.append('e');
            } else if(c == '5'){
                answer.append('f');
            } else if(c == '6'){
                answer.append('g');
            } else if(c == '7'){
                answer.append('h');
            } else if(c == '8'){
                answer.append('i');
            } else if(c == '9'){
                answer.append('j');
            }
        }
        return answer.toString();
    }
}