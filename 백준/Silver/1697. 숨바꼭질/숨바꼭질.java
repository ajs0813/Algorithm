import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수빈이의 위치
        int K = sc.nextInt(); // 동생의 위치

        int result = bfs(N, K);
        System.out.println(result);
    }

    public static int bfs(int N, int K) {
        boolean[] visited = new boolean[100001]; // 방문 여부 확인
        Queue<Integer> queue = new LinkedList<>(); // BFS를 위한 큐
        // 수빈이가 이동할 수 있는 3가지 방향 중 2가지 방향
        int[] move = {-1,1};

        // 시작 위치(인덱스)를 큐에 추가, 움직인 횟수 초기화, 첫 시작점 true 표기
        queue.offer(N);
        int[] count = new int[100001];
        visited[N] = true;

        while(!queue.isEmpty()){ // 큐가 비어있지 않다면
            int current = queue.poll(); // 현재 위치 값에 수빈이의 위치 반환

            // 목표 위치에 도달하면 거리 반환
            if(current == K){ // 현재 값이 동생과 같을 때
                return count[K];
            }

            // 수빈이의 3가지 이동 방향을 탐색
            for(int i = 0; i < 2; i++){
                int next = current + move[i];
                // 수빈이의 움직임이 보드 범위 내에 있을 경우
                if(next>=0 && next<=100000 && !visited[next]){
                    queue.offer(next);
                    visited[next] = true;
                    count[next] = count[current]+1;

                }

            }
            // 수빈이의 움직임 중 순간이동을 할 경우
            int nextDouble = current * 2;
            if(nextDouble>=0 && nextDouble<=100000 && !visited[nextDouble]){
                queue.offer(nextDouble);
                visited[nextDouble] = true;
                count[nextDouble] = count[current]+1;
            }
        }

        // 목적지에 도달할 수 없으면 -1 반환
        return -1;
    }

}

