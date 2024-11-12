class Solution {
    public int solution(int slice, int n) {
        //이거 피자 나눠먹기(1) 아주 조금 변형 아녀?
        
        int answer = (n+(slice-1))/slice;
        return answer;
    }
}