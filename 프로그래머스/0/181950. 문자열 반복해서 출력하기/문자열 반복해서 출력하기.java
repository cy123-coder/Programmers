import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 1;  i <= n ; i++){
            System.out.print(str);
        }
    
    }
}
//sc.nextLine(): 줄바꿈(\n)이 나오기 전까지의 한 줄 전체를 읽어옵니다. (공백 포함)

//sc.next(): 공백(스페이스, 탭, 엔터)을 기준으로 단어 한 개만 읽어옵니다.