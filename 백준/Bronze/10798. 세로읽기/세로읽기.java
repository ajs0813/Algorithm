import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        char[][] board = new char[5][15];

        for(int i = 0; i< board.length; i++){
            String s = sc.next();
            for(int j = 0; j<s.length();j++){
                board[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i<15; i++){
            for(int j = 0; j<5; j++){
                if(!(board[j][i] == ' ' || board[j][i] == '\0')){
                    System.out.print(board[j][i]);
                }
            }
        }

    }
}