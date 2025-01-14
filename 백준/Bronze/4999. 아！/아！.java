import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 재환이가 낼 수 있는 "aah"
        String jaehanAah = scanner.nextLine();
        // 의사가 요구하는 "aah"
        String doctorAah = scanner.nextLine();

        // 두 문자열의 'a' 개수를 비교
        if (jaehanAah.length() >= doctorAah.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}
