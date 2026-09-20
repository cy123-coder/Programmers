class Solution {
    public int solution(int[] num_list) {
     
        int multiSum = 1;
        int addSum = 0;
        for(int i = 0; i< num_list.length; i++){
            
            
            multiSum = multiSum * num_list[i];
            addSum += num_list[i];
}
      
        if(multiSum > addSum*addSum){
            return 0;
        }else{return 1;}
        
    }
}