class Solution {
    public int solution(int num, int k) {
        int answer = -1;
       
        //int형을 String으로 변경
        String str = String.valueOf(num);
        String strK = String.valueOf(k);
        //k 해당 숫자 찾기
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==strK.charAt(0)){
                answer = i+1;
                break;
            }
        }
        
        
        return answer;
    }
}