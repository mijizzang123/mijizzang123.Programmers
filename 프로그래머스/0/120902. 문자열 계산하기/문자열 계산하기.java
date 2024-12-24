class Solution {
    public int solution(String my_string) {
        //공백으로 구분지어서 배열에 넣고..int로 바꾼담에 연산을하자
        /*
        int answer = 0;
        String[] s_arr = my_string.split(" ");
        int[] int_arr = new int[s_arr.length];
        //for문 돌려서 String배열을 int배열로 바꾸고 싶은데 그럼 연산자는 어케 처리하지..
        
        for(int i =0 ;i<s_arr.length;i++){
            int_arr[i]=Integer.parseInt(s_arr[i]);
        }*/
        
        
        //로직 비슷하게 가고, 초기값을 주는걸로 수정
        
        String[] s_arr = my_string.split(" ");
        int[] int_arr = new int[s_arr.length];
        int answer = Integer.parseInt(s_arr[0]);
        
        for(int i=1; i<s_arr.length;i+=2){
            String operator = s_arr[i];
            int next = Integer.parseInt(s_arr[i+1]);
            
            if(operator.equals("+")){
            answer+=next;
        }
        else
            answer-=next;
        }
        
        
        return answer;
    }
}