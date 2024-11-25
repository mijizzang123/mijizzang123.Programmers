class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        //if(direction =="right"){ 
        // == 이거는 주소값 비교야! 문자열 비교 아님
        if(direction.equals("right")){
            answer[0] = numbers[numbers.length-1];
            for(int i=1; i<numbers.length; i++){
                answer[i] = numbers[i-1];
            }
        }
        else if(direction.equals("left")){
            answer[numbers.length-1] = numbers[0];
            for(int i =0; i<numbers.length-1;i++){
                answer[i] = numbers[i+1];
            }
            
        }
        return answer;
    }
}
