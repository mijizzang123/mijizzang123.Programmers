class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i=0; i<dic.length; i++){
            boolean isMatch = true;
            
            for(int j=0; j<spell.length; j++){
                boolean exist = false;
                
                for(int k =0; k<dic[i].length(); k++){
                    if(dic[i].charAt(k)==spell[j].charAt(0)){
                        exist = true;
                        break;
                }     
        }
        if(!exist){
            isMatch = false;
            break;
        }
            }
        if(isMatch){
            return 1;
        }
    }
        return 2;
    }
}