class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0]>=1 && dot[1]>=1){
            return 1;
        }
        else if (dot[0]>=1 && dot[1]<0){
            return 4;
        }
        else if(dot[0]<0 && dot[1]>=1){
            return 2;
        }
        else
            return 3;
        
        //너무 무지성으로 풀었군
    }
}