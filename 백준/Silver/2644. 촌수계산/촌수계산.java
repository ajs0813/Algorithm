import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 전체 사람의 수
        int start = sc.nextInt(); // 촌수를 계산할 첫 번째 사람
        int end = sc.nextInt(); // 촌수를 계산할 두 번째 사람
        int m = sc.nextInt(); // 부모 자식 간의 관계의 개수

        // 그래프 초기화
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력받기
        for(int i = 0; i < m; i++){
            int parent = sc.nextInt();
            int child = sc.nextInt();
            graph.get(parent).add(child);
            graph.get(child).add(parent); // 무방향 그래프
        }

        // BFS를 사용하여 촌수 계산
        int result = bfs(graph, start, end, n);
        System.out.println(result);
    }

    private static int bfs(List<List<Integer>> graph, int start, int end, int n){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        int[] distance = new int[n+1];

        queue.offer(start);
        visited[start] = true;
        distance[start] = 0;

        while (!queue.isEmpty()){
            int current = queue.poll();

            for(int neighbor : graph.get(current)){
                if(!visited[neighbor]){
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                    distance[neighbor] = distance[current] + 1;

                    // 목적지에 도달하면 촌수를 반환
                    if (neighbor == end) {
                        return distance[neighbor];
                    }
                }
            }
        }

        // 목적지에 도달할 수 없으면 - 1반환
        return -1;
    }

}

