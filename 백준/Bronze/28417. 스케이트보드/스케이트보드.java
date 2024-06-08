import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 전체 점수 점수판
        int[][] point = new int[N][7];

        // 런 점수만 구하기 위한 점수판
        int[][] runPoint = new int[N][2];

        // 트릭 점수만 구하기 위한 점수판
        int[][] trickPoint = new int[N][5];

        // 각 선수별 최고 점수 배치 점수판
        int[] player = new int[N];

        // 전체 점수 배치
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 7; j++) {
                point[i][j] = sc.nextInt();
            }
        }

        // 런 점수 재배치
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                runPoint[i][j] = point[i][j];
            }
        }

        // 트릭 점수 재배치
        for (int i = 0; i < N; i++) {
            for (int j = 2; j < 7; j++) {
                trickPoint[i][j-2] = point[i][j];
            }
            Arrays.sort(trickPoint[i]); // 점수 오름차순 정렬
        }


        // 각 선수별 최고 점수 배치
        int runhigh = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 7; j++) {
                if (runPoint[i][0] < runPoint[i][1]) {
                    runhigh = runPoint[i][1];
                } else {
                    runhigh = runPoint[i][0];
                }

            }
            player[i] = runhigh + trickPoint[i][3] + trickPoint[i][4];
        }


        // 우승자 선정
        Arrays.sort(player);
        System.out.println(player[N-1]);










    }
}

