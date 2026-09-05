class Solution {
    public int solution(String[] order) {
      
        int result = 0;
        
        for(String str : order ){
            switch(str){
                    case "anything", "americano", "hotamericano", "americanohot", "iceamericano", "americanoice" ->  result += 4500;
                    case "icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte" ->  result += 5000;
                    default -> System.out.println("잘못된 메뉴입니다");
            }
             
        }return result;
    }
}