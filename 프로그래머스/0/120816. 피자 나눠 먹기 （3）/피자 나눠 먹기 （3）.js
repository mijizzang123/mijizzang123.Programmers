function solution(slice, n) {
    var answer = Math.floor((n+(slice-1))/slice);
    return answer;
}