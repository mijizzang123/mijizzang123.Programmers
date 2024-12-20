class Solution {
    public int solution(String s) {
        //1.공백을 split으로 구분하고 2.parseInt써서 int로 받고 3.if문 써서 Z 전 숫자를 빼는 과정으로 풀어보자
        String[] plus = s.split(" ");
        int result =0;
        int lastAdded=0;
        
        for(int i=0; i<plus.length;i++){
            if(plus[i].equals("Z")){
                //JAVA에서 문자열/문자 비교는 .equals()메서드를 사용.
                result -= lastAdded;
            }
            else{
                lastAdded = Integer.parseInt(plus[i]);
                result += lastAdded;
            }
        }
        return result;
    }
}