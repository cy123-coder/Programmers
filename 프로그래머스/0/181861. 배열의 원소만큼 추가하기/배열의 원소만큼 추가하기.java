class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
      for(int i : arr){
          len += i;
      }
        int newArr[] = new int[len];
        int count =0;
        for(int i: arr){
            for(int k = 1; k <= i; k++){
                newArr[count] = i;
                count++;
}
        }
        return newArr;
        
    }
}