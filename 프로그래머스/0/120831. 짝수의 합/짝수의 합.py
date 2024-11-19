def solution(n):
    """
    파이썬 조건반복문은
    range(start, stop, step)
    이런구조임
    """
    answer = 0
    for i in range(2,n+1,2):
        answer+=i
    return answer