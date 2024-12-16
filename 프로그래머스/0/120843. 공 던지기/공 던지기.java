class Solution {
    public int solution(int[] numbers, int k) {
        int n = numbers.length;
        
        //이동거리 
        int d = (k -1) * 2;
        
        //인덱스
        int idx = d % numbers.length;
        
        return numbers[idx];
    }
}