class Solution {
    public String solution(String rny_string) {
        String answer = "";
        char[] l = rny_string.toCharArray();
        for(int i = 0; i <l.length; i++){
            if ( l[i] == 'm'){ //.equals는 char이 쓸 수 없음 char 은 ''
                answer += "rn";
                
            }else{
                answer += l[i];
            }
            
        }
        return answer;
    }
}