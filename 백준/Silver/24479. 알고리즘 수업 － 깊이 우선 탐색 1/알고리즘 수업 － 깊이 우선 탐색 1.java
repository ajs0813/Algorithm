import java.io.*;
import java.util.*;

public class Main {
    private static List<Integer>[] graph;
    private static boolean[] visited;
    private static int[] order;
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 수
        int M = sc.nextInt(); // 간선의 수
        int R = sc.nextInt(); // 시작 정점

        // 그래프 초기화
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력 받기
        for(int i = 0; i<M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        // 인접 리스트 오름차순 정렬
        for(int i = 1; i<=N; i++){
            Collections.sort(graph[i]);
        }

        // 방문 여부와 순서 저장 배열 초기화
        visited = new boolean[N + 1];
        order = new int[N+1];

        // DFS 수행
        dfs(R);

        // 결과 출력
        for(int i =1; i<=N; i++){
            System.out.println(order[i]);
        }
    }

    private static void dfs(int node){
        visited[node] = true;
        order[node] = ++count;

        for(int neighbor : graph[node]){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
    }

}

