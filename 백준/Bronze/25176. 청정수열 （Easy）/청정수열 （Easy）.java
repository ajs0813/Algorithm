import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int count = factorial(N);
        System.out.println(count);
    }

    // N!을 계산하는 함수
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
