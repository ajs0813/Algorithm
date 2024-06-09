import java.io.*;
import java.util.*;

public class Main {
    private static List<Integer>[] graph;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // 그래프 초기화
        graph = new ArrayList[n+1];
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }

        // 연결 정보 입력 받기
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[n+1];

        // 1번 컴퓨터부터 DFS 시작
        int infectedCount = dfs(1) -1; // 1번 컴퓨터 제외
        System.out.println(infectedCount);
    }

    private static int dfs(int node){
        visited[node] = true;
        int count = 1; // 현재 노드도 감염되므로 1로 시작

        for(int neighbor : graph[node]){
            if (!visited[neighbor]){
                count += dfs(neighbor);
            }
        }
        
        return count;
    }

}

