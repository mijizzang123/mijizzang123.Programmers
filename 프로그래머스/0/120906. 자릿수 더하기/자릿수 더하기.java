class Solution {
    public int solution(int n) {
        //String.valueOf()메서드 사용해서 정수를 문자열로 반환한다음에
        //배열에 하나씩 넣어서 더할까?
        //--> 배열에 더할 필요 없음! charAt()메서드 사용해서 추출해서 더하자
        
        String str = String.valueOf(n);
        int answer = 0;
        for(int i=0; i<str.length();i++){
            answer += str.charAt(i)-'0';
            //-0 안해주면 아스키값으로 입력된대!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }
      
        
        return answer;
    }
}