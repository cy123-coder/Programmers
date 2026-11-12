
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
       ArrayList<Integer> list = new ArrayList<>();
        for(int c : arr){
            int a =0;
            for(int i=0; i<delete_list.length; i++){
                if(delete_list[i] == c){
                    a++;
                }
            }
            if(a == 0){
                list.add(c);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}