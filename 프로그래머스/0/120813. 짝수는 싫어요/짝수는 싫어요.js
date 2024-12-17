function solution(n) {
  
    let size = Math.floor((n+1)/2);
    let answer = new Array(size);
    
    for(let i=0; i<size; i++){
        answer[i] = (i*2)+1;
    }
    return answer;
    }
