import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next(); // 숫자를 문자열로 입력 받음
        sc.close();

        char[] digits = n.toCharArray(); // 문자열을 문자 배열로 변환
        Arrays.sort(digits); // 오름차순 정렬

        // 내림차순으로 출력
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
