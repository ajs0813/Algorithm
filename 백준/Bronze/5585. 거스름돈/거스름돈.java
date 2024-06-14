import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          // 사용자로부터 지불할 금액을 입력받음
          int payment = sc.nextInt();

          // 1000엔 지폐를 사용하므로 거스름돈은 1000엔 - 지불한 금액
          int change = 1000 - payment;

          // 각 동전의 가치
          int[] coins = {500, 100, 50, 10, 5, 1};

          // 동전의 개수
          int coinCount = 0;

          // 동전의 개수를 세는 과정
          for(int coin : coins){
              coinCount += change / coin; // 현재 동전으로 거슬러 줄 수 있는 개수를 더함
              change %= coin; // 남은 거스름돈을 업데이트
          }

          // 결과 출력
          System.out.println(coinCount);
          sc.close();
    }
}
