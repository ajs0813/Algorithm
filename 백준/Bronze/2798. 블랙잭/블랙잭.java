import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 카드의 개수
        int M = sc.nextInt(); // 최대 합

        int[] cards = new int[N];
        for(int i = 0; i<N; i++){
            cards[i] = sc.nextInt();
        }

        int result = findMaxSum(cards, N, M);
        System.out.println(result);

        sc.close();
    }

    public static int findMaxSum(int[] cards, int N, int M){
        int maxSum = 0;

        // 세 장의 카드를 선택하는 모든 경우의 수를 탐색
        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int sum = cards[i] + cards[j] + cards[k];

                    if(sum <= M && sum > maxSum){
                        maxSum = sum;
                    }
                }
            }
        }

        return maxSum;
    }
}

