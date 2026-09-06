class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int bnum = 0;
        int anum =0;
        
        for (int i = 0;   b/(int) Math.pow(10, i) > 0; i++){
            
            bnum = i;
        }
        System.out.println(bnum);
        
         for (int i = 0;   a/(int) Math.pow(10, i) > 0; i++){
            
            anum = i;
        }
          System.out.println(anum);
        
        int ab = a*(int) Math.pow(10, bnum +1) + b;
        int ba = b*(int) Math.pow(10,anum + 1) + a;
        answer = (ab > ba) ? ab : ba ;
        return answer;
    }
}