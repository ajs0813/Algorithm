import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int Max = 0;
        int A = 1;
        int B = 1;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] > Max) {
                    Max = board[i][j];
                    A = i+1;
                    B = j+1;
                }
            }
        }

        System.out.println(Max);
        System.out.print(A+" "+B);

    }
}