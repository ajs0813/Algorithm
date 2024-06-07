import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int switchNum = sc.nextInt(); // 스위치의 수
        sc.nextLine(); // 개행 문자 소비

        String[] switchStateStr = sc.nextLine().split(" ");
        int[] switchState = new int[switchNum + 1]; // 배열을 하나 늘려서 인덱스 번호를 1부터 시작할 계획

        for (int i = 1; i <= switchNum; i++) { // 배열 값에 주어진 스위치 값 배치
            switchState[i] = Integer.parseInt(switchStateStr[i - 1]);
        }

        int studentCnt = sc.nextInt(); // 학생의 수
        sc.nextLine(); // 개행 문자 소비

        for(int i = 0; i < studentCnt; i++) {
            int gender = sc.nextInt();
            int studentSwitch = sc.nextInt();

            // 남학생일 경우
            if (gender == 1) {
                for (int j = studentSwitch; j <= switchNum; j += studentSwitch) {
                    switchState[j] = (switchState[j] == 0) ? 1 : 0; // 스위치 상태 반전
                }
            }

            else if (gender == 2){
                int left = studentSwitch - 1;
                int right = studentSwitch + 1;

                if(left >= 1 && right <= switchNum && switchState[left] != switchState[right]) {
                    switchState[studentSwitch] = (switchState[studentSwitch] == 0) ? 1 : 0;
                } else{
                        while(left >= 1 && right <= switchNum && switchState[left] == switchState[right]) {
                            switchState[left] = (switchState[left] == 0) ? 1 : 0; // 스위치 상태 반전
                            switchState[right] = (switchState[right] == 0) ? 1 : 0; // 스위치 상태 반전
                            left--;
                            right++;
                        }

                    switchState[studentSwitch] = (switchState[studentSwitch] == 0) ? 1 : 0;

                }

            }
        }


        // 배열 출력
        for (int i = 1; i <= switchNum; i++) {
            System.out.print(switchState[i] + " ");
            if (i % 20 == 0) { // 20개씩 출력하는 조건
                System.out.println(); // 줄바꿈
            }

        }
    }
}