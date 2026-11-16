class Solution {
    public String solution(String my_string) {
        char[] answer = my_string.toCharArray();
        String answer1 = "";
        for(int i = answer.length-1; i>=0; i--){
            answer1 += answer[i] + "";
        }
        return answer1;
        
        
    }
}