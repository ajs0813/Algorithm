import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // 두 정수를 입력받기
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            // 입력이 0 0이라면 종료
            if (a == 0 && b == 0) {
                break;
            }
            
            // 첫 번째 수가 두 번째 수보다 크면 "Yes", 아니면 "No" 출력
            if (a > b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
}
