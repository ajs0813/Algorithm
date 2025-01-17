import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int year = scanner.nextInt();
        scanner.close();
        
        // 윤년 판단 조건
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(1); // 윤년
        } else {
            System.out.println(0); // 윤년이 아님
        }
    }
}
