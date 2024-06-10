import java.io.*;
import java.util.*;

public class Main {
    // 나이트가 이동할 수 있는 8가지 방향
    private static final int[] dx = {-2, -1, 1, 2, 2, 1 ,-1, -2};
    private static final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 개수

        for(int i = 0; i < t; i++){
            int l = sc.nextInt(); // 체스판의 한 변 길이
            int startX = sc.nextInt(); // 나이트의 시작 위치 x
            int startY = sc.nextInt(); // 나이트의 시작 위치 y
            int endX = sc.nextInt(); // 나이트가 이동하려는 위치 x
            int endY = sc.nextInt(); // 나이트가 이동하려는 위치 y

            // BFS를 사용하여 최소 이동 횟수를 계산
            int result = bfs(l, startX, startY, endX, endY);
            System.out.println(result);
        }


    }

    private static int bfs(int l, int startX, int startY, int endX, int endY){
        int[][] distance = new int[l][l]; // 체스판의 각 위치까지의 최단 거리를 저장할 배열
        boolean[][] visited = new boolean[l][l]; // 체스판의 각 위치가 방문되었는지 여부를 저장할 배열
        Queue<int[]> queue = new LinkedList<>(); // BFS를 위한 큐, 각 위치는 [x, y] 형태로 저장

        // 시작 위치를 큐에 추가하고 방문 표시 및 거리 초기화
        queue.offer(new int[] {startX, startY});
        visited[startX][startY] = true;
        distance[startX][startY] = 0;

        while (!queue.isEmpty()){ // 큐가 비어있지 않다면
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 목표 위치에 도달하면 거리 반환
            if(x == endX && y == endY){
                return distance[x][y];
            }

            // 나이트의 8가지 이동 방향을 탐색
            for(int i = 0; i < 8; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                // 체스판 범위 내에 있고 아직 방문하지 않은 위치라면
                if(nx >=0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]){
                    queue.offer(new int[] {nx, ny});
                    visited[nx][ny] = true;
                    distance[nx][ny] = distance[x][y] + 1;
                }
            }
        }

        return -1; // 목적지에 도달할 수 없는 경우
    }

}

