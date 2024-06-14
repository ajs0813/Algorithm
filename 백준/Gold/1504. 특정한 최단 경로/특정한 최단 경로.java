import org.w3c.dom.Node;

import java.util.*;

public class Main {
    // Node 클래스는 정점과 해당 정점까지의 비용을 저장하는 데 사용됩니다.
    static class Node implements Comparable<Node> {

        int vertex, cost;

        public Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost; // 비용을 기준으로 오름차순 정렬
        }
    }

    static final int INF = 200000000; // 무한대를 표현하기 위해 큰 값을 사용
    static int N, E; // N: 정점의 개수, E: 간선의 개수
    static List<Node>[] graph; // 그래프를 저장할 리스트 배열
    static int[] dist; // 최단 거리를 저장할 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정점의 개수 N과 간선의 개수 E 입력받기
        N = sc.nextInt();
        E = sc.nextInt();

        // 그래프 초기화
        graph = new ArrayList[N+1]; // 정점 번호가 1부터 시작하므로 N+1 크기 배열
        for(int i = 0; i <= N; i++){
            graph[i] = new ArrayList<>(); // 각 정점마다 리스트 생성
        }

        // 간선 정보 입력받기
        for(int i = 0; i < E; i++){
            int a = sc.nextInt(); // 정점 a
            int b = sc.nextInt(); // 정점 b
            int c = sc.nextInt(); // 거리 c
            graph[a].add(new Node(b, c)); // a에서 b로 가는 간선 추가
            graph[b].add(new Node(a, c)); // b에서 a로 가는 간선 추가 (양방향)
        }

        // 반드시 거쳐야 하는 두 정점 v1과 v2 입력 받기
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        // 1 -> v1 -> v2 -> N 경로의 최단 거리 계산
        int result1 = 0;
        result1 += dijkstra(1, v1); // 1에서 v1까지의 최단 거리
        result1 += dijkstra(v1, v2); // v1에서 v2까지의 최단 거리
        result1 += dijkstra(v2, N); // v2에서 N까지의 최단 거리

        // 1 -> v2 -> v1 -> N 경로의 최단 거리 계산
        int result2 = 0;
        result2 += dijkstra(1, v2); // 1에서 v2까지의 최단 거리
        result2 += dijkstra(v2, v1); // v2에서 v1까지의 최단 거리
        result2 += dijkstra(v1, N); // v1에서 N까지의 최단 거리

        // 두 경로 중 더 짧은 경로 선택
        int answer = Math.min(result1, result2);

        // 결과 출력 (경로가 존재하지 않을 경우 -1 출력)
        if(answer >= INF){
            System.out.println(-1); // 경로가 존재하지 않음
        } else {
            System.out.println(answer); // 최단 경로의 길이 출력
        }

        sc.close(); // 스캐너 닫기

    }

    // 다익스트라 알고리즘을 사용하여 최단 거리를 구하는 메서드
    public static int dijkstra(int start, int end){
        PriorityQueue<Node> pq = new PriorityQueue<>(); // 우선순위 큐 생성
        dist = new int[N+1]; // 최단 거리를 저장할 배열
        Arrays.fill(dist, INF); // 모든 거리를 무한대로 초기화
        dist[start] = 0; // 시작점의 거리는 0
        pq.add(new Node(start, 0)); // 시작점을 큐에 추가

        while(!pq.isEmpty()){
            Node current = pq.poll(); // 현재 노드
            int currentVertex = current.vertex; // 현재 정점
            int currentCost = current.cost; // 현재 정점까지의 비용

            // 현재 정점까지의 비용이 이미 저장된 비용보다 크면 무시
            if(currentCost > dist[currentVertex]) continue;

            // 인접한 정점들을 확인
            for(Node neighbor : graph[currentVertex]){
                int nextVertex = neighbor.vertex; // 인접한 정점
                int nextCost = currentCost + neighbor.cost; // 다음 정점까지의 비용

                // 더 짧은 경로를 발견하면 업데이트
                if(nextCost < dist[nextVertex]){
                    dist[nextVertex] = nextCost; // 최단 거리 업데이트
                    pq.add(new Node(nextVertex, nextCost)); // 큐에 추가
                }
            }
        }

        return dist[end]; // 시작점에서 목표점까지의 최단 거리 반환
    }
}

