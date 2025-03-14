import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        for (int i = 0; i < N; i++) {
            String password = scanner.nextLine();
            if (password.length() >= 6 && password.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        scanner.close();
    }
}
