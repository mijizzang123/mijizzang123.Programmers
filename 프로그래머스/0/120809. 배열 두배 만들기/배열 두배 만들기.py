def solution(numbers):
    #파이썬에서는 배열크기를 초기화 할 때 [0]*len(numbers)를 쓴다.
    answer = [0]*len(numbers)
    
    for i in range (len(numbers)):
     answer[i] = numbers[i] * 2
    
    return answer