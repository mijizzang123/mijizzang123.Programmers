class Solution {
    //팩토리얼때문에 int 범위 넘어가는 케이스가 있는듯 long으로 바꾸자

    public long solution(long balls, long share) {
        long answer = 1;
        //long nnm = 1;
        //for(int i=0; i<(balls-share); i++){
        //    nnm *= (balls-share-i);
        //}
        //long mf = 1;
        //for(int i=0; i<share;i++){
        //    mf *= (share-i);
        //}
        //long nf = 1;
        //for(int i=0; i<balls; i++){
        //    nf *= (balls-i);
        //}
        //answer = nf/(nnm*mf);
        //return answer;
        
        //팩토리얼 안구하고 조합 구하는 방법
        for(long i=0; i<share;i++){
            answer *=(balls-i);
            answer /= (i+1);
        }
        return answer;
    }
}