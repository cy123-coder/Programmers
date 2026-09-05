import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        switch(n%2){
                case 1 -> System.out.println(n+ " is odd");
                case 0 -> System.out.println(n + " is even");
                default -> System.out.println ("예외");
        }
        //System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd")); 삼항연산자를 쓸 수 있는 문제
    }
}
