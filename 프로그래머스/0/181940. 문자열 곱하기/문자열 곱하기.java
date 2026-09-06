class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
    for(int i = 1; i<= k; i++){
        answer += my_string;// 문자열도 +=으로 뒤에 연결하듯 추가할 수 있음
    }
        return answer;
    }
}
/* 
class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k); // k번 반복
    }
}*/