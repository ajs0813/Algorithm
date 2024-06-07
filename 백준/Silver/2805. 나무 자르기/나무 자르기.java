import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 나무의 수 N과 상근이가 필요한 나무의 길이 M 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 나무들의 높이를 저장할 배열
        int[] trees = new int[N];
        
        // 나무들의 높이 입력 받기
        int max = 0; // 나무 높이의 최댓값 저장할 변수
        for(int i = 0; i<N; i++){
            trees[i] = sc.nextInt();
            if(trees[i] > max){
                max = trees[i];
            }
        }
        
        // 이분 탐색 초기값 설정
        int low = 0;
        int high = max;
        int result = 0;
        
        // 이분 탐색 수행
        while(low <= high){
            int mid = (low + high) / 2;
            long total = 0; // 잘린 나무 길이의 합
            
            // 잘린 나무 길이 계산
            for(int i = 0; i< N; i++){
                if(trees[i] > mid){
                    total += trees[i] - mid;
                }
            }
            
            // 잘린 나무 길이가 M 이상인지 확인
            if (total >= M){
                result = mid; // 조건을 만족하면 결과 갱신
                low = mid + 1; // 절단기 높이를 높임
            } else {
                high = mid - 1; // 절단기 높이를 낮춤
            }
        }
        
        // 결과 출력
        System.out.println(result);
        sc.close();
    }

}

