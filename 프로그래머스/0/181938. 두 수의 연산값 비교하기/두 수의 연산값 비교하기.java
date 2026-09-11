class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = String.valueOf(a) + String.valueOf(b);
        int ab = Integer.parseInt(str);
        int ab2 = 2*a*b;
        
        if (ab > ab2){
            answer = ab;
        }else{
            answer = ab2;
}
        
        return answer;
    }
}