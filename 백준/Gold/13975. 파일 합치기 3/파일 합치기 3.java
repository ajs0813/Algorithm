import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextInt(); // 테스트 케이스의 수

        while(T-- > 0){ // T가 0보다 클 때까지 반복
            long K = sc.nextInt(); // 파일의 수
            PriorityQueue<Long> pq = new PriorityQueue<>();

            for(long i = 0; i < K; i++){
                pq.offer(sc.nextLong());
            }

            long totalCost = 0;
            while(pq.size() > 1){
                long first = pq.poll();
                long second = pq.poll();
                long mergeCost = first + second;
                totalCost += mergeCost;
                pq.offer(mergeCost);
            }

            System.out.println(totalCost);

        }
    }
}

