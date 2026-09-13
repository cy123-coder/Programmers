class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        String answer = "";
       
        int end = 0;
        for(int i =0; i < my_string.length(); i++){
            if(i<s || end >= overwrite_string.length() ){
                answer += my_string.charAt(i);
                
            }else{
                answer += overwrite_string.charAt(end);
                end++;
            }
        }
        return answer;
    }
}