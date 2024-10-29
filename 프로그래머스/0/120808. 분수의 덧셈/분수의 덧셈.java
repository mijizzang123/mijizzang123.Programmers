class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //기약분수==더 이상 약분이 되지 않는 분수
        //분모의 최소공배수부터 찾아야함
        //최소공배수는  LCM , 최대공약수는 GCD로 표기 
        
        //최대공약수(gcd)찾기
       int a = denom1;
        int b = denom2;
        int gcd;
        while (b!=0){
            int temp = a%b;
            a=b;
            b=temp;
        }
        gcd = a;
        
        //최소공배수(lcm)찾기
        
        int lcm=(denom1*denom2)/gcd;
        
        //두 분수의 합 구하기
        int numer3 = ((lcm/denom1)*numer1)+((lcm/denom2)*numer2);
        int denom3 = lcm;
        
        //합하여 만들어진 분수도 기약분수로 만들기
        int i = numer3;
        int j = denom3;
        while(j !=0){
            int temp = i %j;
            i = j;
            j = temp;
        }
        gcd = i;
        
        numer3=(numer3/gcd);
        denom3=(denom3/gcd);
        
        int[] answer = {numer3,denom3};
        return answer;
        
    }
}