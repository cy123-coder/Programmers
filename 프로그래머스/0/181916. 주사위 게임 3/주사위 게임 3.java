import java.util.Arrays;
// 모든 경우의수를 다 if로 나누는 방식만 생각이 나서 다른 사람 코드 참고
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice); // 숫자 정렬하는 메소드 가져오기

        // 네 숫자가 모두 같음
        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        }

        // 2. 세 숫자가 같음 근데 그 숫자가 제일 작음
        if (dice[0] == dice[2]) {
            int p = dice[0];
            int q = dice[3];
            return (int) Math.pow(10 * p + q, 2);
        }
        if (dice[1] == dice[3]) {//세 숫자가 같음 근데 큰숫자
            int p = dice[1];
            int q = dice[0];
            return (int) Math.pow(10 * p + q, 2);
        }

        //  두 개씩 같음
        if (dice[0] == dice[1] && dice[2] == dice[3]) {
            int p = dice[0];
            int q = dice[2];
            return (p + q) * Math.abs(p - q);
        }

        //  두 개만 같고 나머지 둘은 다름
        if (dice[0] == dice[1]) {
            return dice[2] * dice[3];
        }
        if (dice[1] == dice[2]) {
            return dice[0] * dice[3];
        }
        if (dice[2] == dice[3]) {
            return dice[0] * dice[1];
        }

        //모두 다름
        return dice[0];
    }
}