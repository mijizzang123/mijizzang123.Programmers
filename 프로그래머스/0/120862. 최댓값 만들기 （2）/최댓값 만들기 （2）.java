import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        //음수가 있는 경우를 어케 처리하지
        //->Arrays.sort()메서드 활용
        
        Arrays.sort(numbers);
       int num1 = numbers[0] * numbers[1];
       int num2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if(num1 >=num2){
            answer = num1;
        }
        else
            answer = num2;
        
        return answer;
    }
}