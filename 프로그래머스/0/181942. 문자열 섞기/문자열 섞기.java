class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str2.length(); i++){
            
            answer += str1.charAt(i) ;
                answer += str2.charAt(i);
            /* 왜 answer += str1.charAt(i) + str2.charAt(i) ; 로 하면 숫자가 출력되는가 */
}
        return answer;
    }
}