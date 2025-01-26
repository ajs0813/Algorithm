import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        // 세 수의 합 계산
        long sum = A + B + C;

        // 결과 출력
        System.out.println(sum);

        scanner.close();
    }
}
