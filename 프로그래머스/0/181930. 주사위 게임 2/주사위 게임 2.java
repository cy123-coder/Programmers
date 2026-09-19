class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int e = equ(a,b,c);
        switch(e){
                case 0 ->  answer  = a+ b+ c;
                case 1 ->   answer  = (a + b + c) * (a*a + b*b + c*c );
                case 2 ->   answer  =  (a + b + c) * (a*a + b*b + c*c );
                case 3 ->  answer  = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c );
                default -> answer = 0;
        }
        return answer;
    }
    private int equ(int a, int b, int c){
        
        int result = 0;
       if(a == b){
           result +=1;
       }
    if(b == c){
        result +=1;
    }
        

    if(c ==a){
        result +=1;
    }
        
        return result;
    }
}
/*

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;

        int count = 1;
        if(a == b || a == c || b == c) {
            count++;
        }

        if(a == b && b == c) {
            count++;
        }

        for(int i = 1; i <= count; i++) {
            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
        }

        return answer;
    }

    private int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
    }
}*/
