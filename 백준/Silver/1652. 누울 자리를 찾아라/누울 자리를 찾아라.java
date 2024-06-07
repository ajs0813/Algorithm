import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[][] room = new char[101][101];

        for(int i = 0; i < N; i++){
            String str = sc.next();
            for(int j = 0; j < N; j++){
                room[i][j] = str.charAt(j);
            }
            room[i][N] = room[N][i] = 'X'; // 처음, 끝의 벽도 짐으로 판단한다.
        }

        // 가로, 세로 누울 수 있는 자리 판별
        int rowCount = 0; // 가로로 누울 수 있는 자리의 개수
        int colCount = 0; // 세로로 누울 수 있는 자리의 개수
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N-1; j++){
                // 연속해서 2칸이 비어있고, 그 다음이 벽일 경우
                if(room[i][j] == '.' && room[i][j+1] == '.' && room[i][j+2] == 'X')
                    rowCount ++;
                if(room[j][i] == '.' && room[j+1][i] == '.' && room[j+2][i] == 'X')
                    colCount ++;
            }
        }

        System.out.println(rowCount + " " + colCount);
    }
}