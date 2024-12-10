def solution(array):
    
    
    for i in range(len(array)):
        for j in range(len(array)-1-i):
         if(array[j]>array[j+1]):
            temp = array[j]
            array[j] = array[j+1]
            array[j+1] = temp
            
        
    return array[len(array)//2]