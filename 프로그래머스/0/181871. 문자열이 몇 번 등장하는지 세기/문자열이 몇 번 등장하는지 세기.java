class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        
        for(int i = 0; i <= myString.length()-pat.length(); i++){
            
            // i번째 위치부터 시작하는 문자열이 pat으로 시작하는지 확인
            if (myString.substring(i).startsWith(pat)) {
                answer++;
          
    }  
}return answer;}}