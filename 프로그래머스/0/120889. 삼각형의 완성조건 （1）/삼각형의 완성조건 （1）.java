class Solution {
    public int solution(int[] sides) {
        //일단..배열에 들어있는 수를 오름차순으로 정렬시킨 다음에 계산하는게 더 편한가..?
        int answer = 0;
        //Array.sort() 메서드를 사용하면 더 간단히 가능합니다..
        for(int i=0; i<sides.length-1;i++){
            for(int j=0; j<sides.length-1-i; j++){
                if(sides[j]>sides[j+1]){
                    int temp = sides[j];
                    sides[j] = sides[j+1];
                    sides[j+1] = temp;    
                }
            }
        }
        /////여기까지가 오름차순 로직
        
        if(sides[2] < sides[0]+sides[1]){
            return 1;
        }
        return 2;
    }
}