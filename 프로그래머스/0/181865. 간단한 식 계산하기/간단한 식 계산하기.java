class Solution {
    public int solution(String binomial) {
        int answer = 0;
        int n1 ;
        int n2;
        String op ;
        
        String[] newCh = binomial.split(" ");
        
       n1 = Integer.parseInt(newCh[0]);
         n2 = Integer.parseInt(newCh[2]);//Integer.parseInt
        op = newCh[1];
        System.out.println( n1 + "," + n2 +"," + op);
        switch(op){
            case "+" : return n1 + n2; 
            case "-": return n1 - n2; 
            case "*" : return n1 * n2;

        }
       
    return -1;
}
}