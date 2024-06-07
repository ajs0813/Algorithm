import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        for(int i = 1; i <= N; i++){
            String line = sc.nextLine();
            String[] words = line.split(" ");
            StringBuilder reversedLine = new StringBuilder();

            reversedLine.append("Case #").append(i).append(": ");
            for(int j = words.length - 1; j >= 0; j--){
                reversedLine.append(words[j]);
                if(j>0) {
                    reversedLine.append(" ");
                }
            }

            System.out.println(reversedLine.toString());
        }

        sc.close();
    }
}