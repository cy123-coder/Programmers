class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i =0; i<myString.length(); i++){
            if( myString.charAt(i) == 'a' ||  myString.charAt(i) ==  'A'){
            answer += Character.toUpperCase(myString.charAt(i));
        }else{
            answer += Character.toLowerCase(myString.charAt(i));
        }
        }
        
        return answer;
    }
}

/*

class Solution {

    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');

        return myString;
    }
}*/
