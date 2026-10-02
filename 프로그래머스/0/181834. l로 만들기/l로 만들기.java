     
     class Solution {
    public String solution(String myString) {
        String f = "";
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            // 'a' ~ 'k' 문자는 모두 'l'보다 작음
            if (c < 'l') {
                f += "l";
            } else {
                f += c;
            }
        }
        return f;
    }}
