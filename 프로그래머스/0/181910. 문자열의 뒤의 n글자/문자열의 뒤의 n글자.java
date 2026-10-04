class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int a = my_string.length() - n; a<my_string.length(); a++){
            answer += ""+ my_string.charAt(a);
            
        }
        return answer;
    }
}