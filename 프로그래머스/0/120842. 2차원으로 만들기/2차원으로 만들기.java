class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
            
            //2차원 배열 헷갈린다...........
            int index = 0;
            for(int i=0; i<num_list.length/n; i++){
                for(int j=0; j<n; j++){
                    answer[i][j] = num_list[index];
                    index++;
                }
            }
            
        return answer;
    }
}