function solution(numbers) {
    //let [] answer = new let [numbers.length]; ㅋㅋㅋㅋ이건 자바잖아요.. 변수만 let으로 해주면 끝이냐고
    let answer = new Array(numbers.legnth);
    for(let i=0; i<numbers.length; i++){
        answer[i] = numbers[i]*2;
    }
    
    return answer;
}