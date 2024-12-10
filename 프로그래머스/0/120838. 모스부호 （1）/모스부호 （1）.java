import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
       Map<String,String> morse = new HashMap<>();
        //이렇게 노가다로 푸는게 맞는건가?
        
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
        
        //공백 분리하기
        String[] morseArray = letter.split(" ");
        
        //변환하기..
        StringBuilder answer = new StringBuilder();
        for(String morseCode : morseArray){
            answer.append(morse.get(morseCode));
        }
        
        return answer.toString();
    }
}