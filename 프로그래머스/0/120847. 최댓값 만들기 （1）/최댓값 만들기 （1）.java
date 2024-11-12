import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        //이것도 정렬한 다음에 제일큰수, 두번째로 큰 수 곱하면 되는건데
        //Arrays.sort()를 써볼가
        
        Arrays.sort(numbers);
    
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}