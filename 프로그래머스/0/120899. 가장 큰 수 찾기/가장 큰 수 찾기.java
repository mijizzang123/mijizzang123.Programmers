class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int [2];
        for(int i=0; i<array.length-1;i++){
            for(int j=1; j<array.length;j++){
                if(array[i]<array[j]){
                    int temp = array[j];
                    answer[0]=temp;
                    answer[1]=j;
                }
                else {
                int temp = array[i];
                answer[0]=temp;
                answer[1]=i;
                }
            }
        }
        return answer;
    }
}