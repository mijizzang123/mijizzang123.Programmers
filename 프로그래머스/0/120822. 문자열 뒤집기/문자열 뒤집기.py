def solution(my_string):
    answer = ''
    for i in range(len(my_string)):
        j = len(my_string)-1-i
        answer += my_string[j]
    return answer