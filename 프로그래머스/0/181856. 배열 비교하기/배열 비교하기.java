class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a1 = arr1.length;
        int a2 = arr2.length;
        int as1 = 0;
        int as2 = 0;
        
        for(int a : arr1){
            as1 += a;
        }
        for(int a : arr2){
            as2 += a;
        }
        
        System.out.print(a1 +" "+ a2 + " " + as1 + " "+ as2);
         if(a1 == a2){
             if(as1 > as2){
                 return 1;
             }else if(as1 <as2){
                 return -1;
             }else {
                 return 0;
             }
             
         }else if(a1 > a2){
             return 1;
         }else{
             return -1;
         }
    
    }
}