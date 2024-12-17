function solution(array) {
    let answer = 0;
    
    for(let i=0; i<array.length-1;i++){
        for(let k=i+1;k<array.length;k++){
            if(array[i] > array[k]){
                let temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
    }
    answer = array[Math.floor(array.length/2)];
    return answer;
}