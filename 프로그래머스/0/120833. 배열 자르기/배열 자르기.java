class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 배열의 크기는 num2 - num1
        int[] answer = new int[num2 - num1 + 1];  
        
        // num1부터 num2까지 잘라내기
        for(int i = 0; i < num2 - num1 +1; i++) {
            answer[i] = numbers[i + num1];  // numbers의 num1번 인덱스부터 num2번 인덱스까지 복사
        }
        
        return answer;  // 잘라낸 배열 반환
    }
}
