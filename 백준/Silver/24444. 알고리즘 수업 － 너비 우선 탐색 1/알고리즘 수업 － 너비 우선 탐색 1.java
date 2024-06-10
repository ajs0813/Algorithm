import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] visitOrder;
    static boolean[] visited;
    static int order = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        graph = new ArrayList[N+1];
        visitOrder = new int[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i < M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        // 인접 리스트 오름차순 정렬
        for(int i = 1; i<=N; i++){
            Collections.sort(graph[i]);
        }

        bfs(R);

        for(int i = 1; i<=N; i++){
            System.out.println(visitOrder[i]);
        }
    }

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        visitOrder[start] = ++order;

        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            for(int neighbor : graph[currentNode]){
                if(!visited[neighbor]){
                    queue.add(neighbor);
                    visited[neighbor] = true;
                    visitOrder[neighbor] = ++order;
                }
            }
        }
    }

}

