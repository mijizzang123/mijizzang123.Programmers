function solution(array) {
   let idx = new Array(1001).fill(0);
    
    for(let i of array){
        idx[i] += 1;
    }
    const maxCount = Math.max(...idx);
    
    let countMax = idx.filter(count => count === maxCount).length;
    
    if(countMax > 1){
        return -1;
    }
    return idx.indexOf(maxCount);
}