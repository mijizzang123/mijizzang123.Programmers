def solution(num_list):
    answer = []
    for i in range (len(num_list)):
        j = len(num_list)-1-i
        answer.append(num_list[j])
        
    return answer