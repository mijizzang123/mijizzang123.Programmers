class Solution {
    public int[] solution(int n) {
        
        //for문으로 1부터 n까지 n으로 나눠서 나머지가 없는 애들만 배열에 담으면 되는거 아녀?
        //근데 answer 배열 크기부터 알아내야해
        int count = 0;
        for(int k=1; k<=n; k++){
            if(n%k==0){
               count++; 
            }
        }
        
        int answer[] = new int [count];
        
        int index = 0;
        for(int k=1; k<=n; k++){
            if(n%k==0){
                answer[index++] = k;
            }
        }
        return answer;
    }
}