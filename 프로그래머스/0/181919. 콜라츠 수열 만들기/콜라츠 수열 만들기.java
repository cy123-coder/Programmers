class Solution {
    public int[] solution(int n) {
       
        int a = 0;
        int nn =n;
        for(int i =0; n !=1 ;i++){
            if (n % 2 ==0){
                n = n/2;
            }else{
                n = 3*n + 1;
            }
            a = i+1;
          
        }
         int[] answer = new int[a+1];
        
         for(int i =0; nn !=1 ;i++){
             answer[i] = nn;
              System.out.println(nn);
            if (nn%2 ==0){
                nn = nn/2;
            }else{
                nn = 3* nn +1;
            }
           
           
        }
        answer[a] = nn;
        return answer;
    }
}