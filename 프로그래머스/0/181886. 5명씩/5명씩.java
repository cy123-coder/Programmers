class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length+4)/5];
        
        int a = 0;
        for(int i = 0; i<names.length; i++){
            
            

            if ((i) % 5 ==0 ){//왜  0번 인덱스는 안띄울까 
                
                answer[a] = names[i];
                a++;
               
            }
        }
        
        return answer;
    }
}