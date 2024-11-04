class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        //Math.pow 메서드를 외워두자
        //double result = Math.pow(n,t) 이런식임 . 디폴트 형식이 double인가바
        
        answer = (int)(n * Math.pow(2,t));
        //answer가 int형이므로 형변환 해주기
        
        return answer;
    }
}