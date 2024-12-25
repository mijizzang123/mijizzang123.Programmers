import java.util.Arrays;

class Solution {

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i =0; i<quiz.length;i++){
            String[] quiz2 = quiz[i].split(" ");
            int X = Integer.parseInt(quiz2[0]);
            int Y = Integer.parseInt(quiz2[2]);
            int Z = Integer.parseInt(quiz2[4]);
        
         String operator = quiz2[1];
            int result = 0;
        
         if (operator.equals("+")){
            result= X+Y;
         }
            else {
                result = X-Y;
            }
        
            if(result == Z) {
            answer[i] = "O";
            }
            else{
            answer[i] = "X";
            }
        }
        return answer;
    }
}