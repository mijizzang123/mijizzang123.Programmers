import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 각 원소의 빈도를 셈
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = 0;
        int mostFrequentValue = -1;
        int count = 0;
        
        // 최빈값과 그 빈도를 찾음
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentValue = key;
                count = 1;  // 최빈값을 새로 찾았으므로 count를 1로 설정
            } else if (frequency == maxFrequency) {
                count++;  // 동일한 빈도를 가진 값이 더 있으면 count 증가
            }
        }
        
        // 최빈값이 여러 개일 경우 -1을 반환
        if (count > 1) {
            return -1;
        }
        
        return mostFrequentValue;  // 최빈값 반환
    }
}
