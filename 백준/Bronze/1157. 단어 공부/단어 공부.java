import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();

        // 1. 알파벳별 counting
        int[] count = new int[26];

        int maxValue = 0; // 최댓값
        char maxChar = '?'; // 최댓값의 알파벳

        for(int i = 0; i< str.length(); i++){
            int idx = str.charAt(i) - 'A'; // 배열에 입력된 문자열 인덱스 번호
            ++count[idx]; // 입력된 문자열 인덱스 번호가 나오면 체크(카운팅)

            if(maxValue < count [idx]){ // 최대 값이 카운트 된 배열값보다 작으면 최댓값 교체
                maxValue = count[idx];
                maxChar = str.charAt(i); // 최대 값의 알파벳 갱신
            } else if (maxValue == count[idx]){ // 최댓값과 같은 값이 나온다면 '?'
                maxChar = '?';
            }
        }

        bw.write(maxChar);




        // 2. 최댓값 업데이트

        bw.close();
        br.close();

    }
}
