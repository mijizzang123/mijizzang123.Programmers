class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        for(int i=0;i<n;i++){
            factorial *= i+1;
            if(factorial > n){
                answer = i;
                break;
            }
            else if(factorial == n){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}