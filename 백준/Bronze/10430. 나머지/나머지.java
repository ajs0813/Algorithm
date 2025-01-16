import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 계산 및 출력
        System.out.println((A + B) % C);           // (A+B)%C
        System.out.println(((A % C) + (B % C)) % C); // ((A%C) + (B%C))%C
        System.out.println((A * B) % C);           // (A*B)%C
        System.out.println(((A % C) * (B % C)) % C); // ((A%C) * (B%C))%C

        sc.close();
    }
}