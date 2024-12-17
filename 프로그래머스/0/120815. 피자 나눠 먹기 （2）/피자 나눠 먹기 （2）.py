def solution(n):
    a = n
    b = 6
    gcd = 0
    
    while(b !=0):
        temp = a % b
        a = b
        b = temp
    gcd = a
    
    answer = ((n*6)/gcd)/6
    
    return answer