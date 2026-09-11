class Solution {
    public int solution(String myString, String pat) {
        
        String newString =myString.toUpperCase();
        String newPat = pat.toUpperCase();
        int answer = (newString.contains(newPat) ) ? 1:0;
        
        return answer;
    }
}