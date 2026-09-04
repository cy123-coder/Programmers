import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] arr = a.toCharArray(); // 문자열을 char 배열로 변환하는 메서드

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (Character.isLowerCase(c)) {// char이라서 Character.isLowerCase(c)로 판단
                 arr[i] = Character.toUpperCase(c); // 소문자를 대문자로 변환해 배열에 저장
            }else{
                arr[i] = Character.toLowerCase(c);//대문자를 소문자로 변환해서 저장
            }
        }

        String result = new String(arr); // 수정된 배열을 다시 String으로 변환
        System.out.println(result);
        
    }
}