class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int evenSum = 0;
        int oddSum = 0;
        int e = 0;
        int o = 0;//이게 포문 안으로 들어가면 계속 초기화되면서  자릿수 표현 불가
        
        for(int i = 0; i <num_list.length; i++){
            
            
            int a = num_list[num_list.length - (i+1)];
            
            if( a % 2 == 0){
                evenSum += a * ((int) Math.pow(10, e));// Math.pow(10, e) 지수 계산하는 메서드 double로 반환
                e++;
            }else{
                oddSum += a * ((int) Math.pow(10, o));
                o++;
            }
                
}
        answer += evenSum + oddSum;
        return answer;
    }
}