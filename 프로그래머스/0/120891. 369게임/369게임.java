class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order>0) {
            int result = order % 10;
            if(result==3 || result==6 || result==9){
                answer++;
            }
             order = order/10;
        }
          
        return answer;
    }
}