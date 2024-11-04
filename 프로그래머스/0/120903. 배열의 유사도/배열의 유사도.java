class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i=0; i<s1.length;i++){
            for (int j=0; j<s2.length;j++){
               // if (s1[i]==s2[j])  이건 같은 메모리주소인지 참조값 확인하는거임
               //     answer++;
                if(s1[i].equals(s2[j]))
                    answer++;
            }
        }
        return answer;
    }
}