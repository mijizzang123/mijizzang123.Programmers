class Solution {
    public int solution(String str1, String str2) {
        //indexOf() 메소드 쓴 다음 나온 값을 변환해서 반환하자
        
        int index = str1.indexOf(str2);
        if(index != -1) {
            return 1;
        }
        else
            return 2;
    
    }
}