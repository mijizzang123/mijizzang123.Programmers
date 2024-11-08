class Solution {
    public int[] solution(int n, int[] numlist) {
        int count=0;
        //일단 n의 배수 개수를 세자
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                count++;
            }
        } 
            int answer[] = new int[count];
        
            int answerIndex=0;
        
            for(int i=0; i<numlist.length;i++){
                if(numlist[i]%n==0){
                    answer[answerIndex]=numlist[i];
                    answerIndex++;
                    }
                }
            
        
        return answer;
        //아 뭔가 더 간단한 방법이 분명 있을텐데..
    }
}