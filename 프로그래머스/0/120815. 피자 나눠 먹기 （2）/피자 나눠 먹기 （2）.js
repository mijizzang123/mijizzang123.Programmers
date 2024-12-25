function solution(n) {
    //n과 6의 최소공배수 ,단 6만빼고
    let answer = 0;
    if (n===6){
        answer = 1;
    }
    else
        for(let i=1; i<=600; i++){
            if((6*i)%n===0){
                answer = ((6*i)/6);
                break;
            }
        }
    return answer;
}