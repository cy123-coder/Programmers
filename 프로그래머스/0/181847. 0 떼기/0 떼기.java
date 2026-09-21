class Solution {
    public String solution(String n_str) {
        String answer = "";
        int a = 0;
        int b =0;
        for(int i =0; i<n_str.length(); i++){
           if(b!= 1 && n_str.charAt(i) !='0'){
               a= i; b = 1;
           }
        }
        
        for(int i = a; i<n_str.length(); i++){
            answer += n_str.charAt(i);
        }
        
        return answer;
    }
}