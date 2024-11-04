class Solution {
    public int solution(int hp) {
        //걍 hp값을 나누고 나머지 값을 또 나누고 나누고 하면 되는거 아녀?
        
        int answer = 0;
        int temp = 0;
        int temp2 = 0 ;
        temp = (hp/5);
        answer += temp;
        temp = ((hp%5)/3);
        answer += temp;
        temp = ((hp%5)%3);
        answer += temp;
        return answer;
    }
}