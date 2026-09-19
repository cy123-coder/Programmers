class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret ="";
        
        
        for(int idx= 0; idx< code.length() ;idx++){
            if (mode == 0 ){
                System.out.println(mode);
                if( code.charAt(idx) == '1' ){//''없으면 숫자라고 판단함
                     mode = 1;
                   
                    }else{
                 if(idx % 2 == 0 && idx != 1){
                        ret += code.charAt(idx);
                   
                }}

        }else if(mode ==1){
                System.out.println(mode);
                if( code.charAt(idx) == '1'){
                    mode= 0;
}else{
                    if(idx % 2 == 1  ){
                        ret +=  code.charAt(idx);
                        
}
                }
}
            }
         return (ret == "" ) ? "EMPTY" : ret ;
    }
       
}

/*

class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
*/
