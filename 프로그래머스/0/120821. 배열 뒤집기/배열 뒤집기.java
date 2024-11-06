class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length];
        
        for(int i=0; i<num_list.length;i++){
           // int j = num_list.length-i;
           // 이렇게하면 answer배열의 길이가 num_list를 넘어가버림!!!
            int j = num_list.length-1-i;
            answer[i] = num_list[j];

        }
        return answer;
    }
}