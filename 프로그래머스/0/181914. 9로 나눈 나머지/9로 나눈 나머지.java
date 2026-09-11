class Solution {
    public int solution(String number) {
       
        int sum = 0;
        
        for (int i = 0; i< number.length(); i++){
            String str = number.charAt(i) + "";// char에 "" 빈 문자열을 더하면 문자열로 바뀜
            System.out.println( Integer.parseInt(str) );
           sum += Integer.parseInt(str) ;
            
        }
        int answer = sum % 9;
        return answer;
    }
}
//피연산자 중 하나라도 String이 있으면, 나머지 하나를 강제로 String으로 바꾼 뒤 두 문자열을 이어붙입니다.