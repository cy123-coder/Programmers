import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] string = a.toCharArray(); // String을 char 배열로 바꿔준다
        for (int i = 0; i<string.length; i++){
            System.out.println(string[i]);
        }
    }
}