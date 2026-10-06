class Solution {
    public String solution(String my_string, int[] indices) {
        
        boolean[] r = new boolean[my_string.length()];
        
        for (int i : indices) {
            r[i] = true; 
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
           
            if (!r[i]) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}