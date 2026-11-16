class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] newChar = my_string.toCharArray();
        for(char c : newChar){
            if(c == letter.charAt(0)){
                
            }else{
                answer+= c +"";
            }
        }
        return answer;
    }
}