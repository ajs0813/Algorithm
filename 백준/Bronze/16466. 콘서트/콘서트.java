import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1차 티켓팅에서 팔린 티켓들의 수 N 입력받기
        int N = sc.nextInt();

        // 1차 티켓팅에서 팔린 티켓 번호들을 저장할 Set 생성
        Set<Integer> soldTickets = new HashSet<>();

        // 1차 티켓팅에서 팔린 티켓 번호들을 입력받아 Set에 저장
        for(int i = 0; i < N; i++){
            int ticketNumber= sc.nextInt();
            soldTickets.add(ticketNumber);
        }

        // 가장 작은 사용 가능한 티켓 번호 찾기
        int ticket = 1;
        while(soldTickets.contains(ticket)){
            ticket++;
        }

        // 결과 출력
        System.out.println(ticket);

        sc.close();
    }

}

