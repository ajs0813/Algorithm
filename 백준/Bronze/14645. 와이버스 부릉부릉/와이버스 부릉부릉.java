import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 정거장 수
        int K = sc.nextInt(); // 초기 탑승 인원
        
        int passengers = K;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt(); // 탑승 인원
            int B = sc.nextInt(); // 하차 인원
            
            passengers -= B; // 내리는 사람 처리
            passengers += A; // 타는 사람 처리
        }
        
        System.out.println("비와이");
        sc.close();
    }
}
