import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        //내림차순으로 정렬하고... 그 다음 어카지.. 배열 복사?
        int[] answer = new int[emergency.length];
        int[] sorted = Arrays.copyOf(emergency,emergency.length);
        
      Arrays.sort(sorted);
        //내림차순으로 바꾸기
        for(int i=0; i<sorted.length/2;i++){
            int temp = sorted[i];
            sorted[i] = sorted[sorted.length -1-i];
            sorted[sorted.length-1-i] = temp;
        }
        //순위를..찾아보자
        for(int i=0; i<emergency.length;i++){
            for(int j=0; j<sorted.length;j++){
                if(emergency[i]==sorted[j]){
                    answer[i]=j+1;
                    break;
                }
            }
        }
        return answer;
    }
}