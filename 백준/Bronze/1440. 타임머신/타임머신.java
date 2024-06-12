import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] parts = input.split(":");
        int count = permuteAndCount(parts,0);
        System.out.println(count);
        sc.close();
    }

    private static int permuteAndCount(String[] parts, int start){
        int count = 0;
        if(start == parts.length){ // 배열의 모든 요소가 재귀적으로 처리된 상태
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            int second = Integer.parseInt(parts[2]);

            if(hour >= 1 && hour <= 12 && minute >=0 && minute <= 59 && second >= 0 && second <= 59){
                return 1;// 유효한 시간 하나를 찾았으므로 1을 반환
            }
        } else {
            for (int i = start; i < parts.length; i++){
                // parts[start]와 parts[i] 교체
                String temp = parts[start];
                parts[start] = parts[i];
                parts[i] = temp;

                // 재귀 호출로 다음 위치로 이동
                count += permuteAndCount(parts, start + 1);

                // // 교환한 요소를 원래 위치로 되돌림 (백트래킹)
                temp = parts[start];
                parts[start] = parts[i];
                parts[i] = temp;
            }
        }
        return count; // 누적된 유효한 시간의 개수를 반환
    }
}

