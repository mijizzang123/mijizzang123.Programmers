def solution(price):
    answer = 0
    if(price >= 100000 and price <300000):
        '''
        파이썬에서는 소수점까지 계산해버리니까 int()로 감싸서 내림해주기.
        '''
        answer = int(price*0.95)
    elif (price >=300000 and price < 500000):
        answer = int(price*0.9)
    elif(price>=500000):
        answer = int(price*0.8)
    else:
        answer = price
    return answer