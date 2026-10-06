class Solution {
    public int[] solution(int[] num_list) {
        int b = 0;
        int[] answer = new int[num_list.length - 5];
        for( int j = 0; j< num_list.length ; j++){
            
            for(int i =0; i<num_list.length-1; i++){
            if(num_list[i]>num_list[i+1]){
                int a=num_list[i+1];
                 num_list[i+1] = num_list[i];
                 num_list[i] = a;
                
            }else{
                
            }
            
            
        }
        
        }
        
        for(int i=5; i<num_list.length ; i++){
            answer[b] = num_list[i];
            b++;
        }
        return answer;
    }
}