class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i< my_string.length(); i++){
             //string도 0번쨰부터 시작
            if(my_string.charAt(i) == alp.charAt(0)){
                char c = my_string.charAt(i);
                answer += Character.toUpperCase(c);
            }else{
                answer += my_string.charAt(i);
            }
}
        return answer;
    }
}