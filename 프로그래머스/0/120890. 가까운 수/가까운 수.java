import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int closest = array[0];
        int minDiff = Math.abs(n-closest);
        
        for(int i=1; i<array.length; i++){
            int diff = Math.abs(n-array[i]);
            
            if(diff<minDiff){
                closest = array[i];
                minDiff = diff;
            }
        }
        
        return closest;
    }
}