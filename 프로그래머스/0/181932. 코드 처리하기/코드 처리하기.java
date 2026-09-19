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