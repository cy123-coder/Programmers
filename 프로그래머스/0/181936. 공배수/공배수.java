class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        if ((number % n == 0) && (number % m == 0)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}
/*class Solution {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}*/ //이렇게 삼항연산자로 더 간단하게 풀이 할수 있다
