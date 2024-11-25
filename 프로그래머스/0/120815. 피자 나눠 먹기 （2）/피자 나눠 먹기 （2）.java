class Solution {
    public int solution(int n) {
        //이거 n이랑 6의 최소공배수 찾는 문제인데
        //lmc,gcd 알고리즘 외워라
        
        int a = n;
        int b = 6;
        int gcd = 0;
        //gcd부터 구하자
        
        while(b !=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        gcd = a;
        
        //lmc 구하자
        int answer = ((n*6)/gcd)/6;
        return answer;
    }
}