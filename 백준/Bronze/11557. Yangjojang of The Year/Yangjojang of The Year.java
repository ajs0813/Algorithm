import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 입력 받기
        int T = sc.nextInt();

        for(int t = 0; t < T; t++){
            // 각 테스트 케이스의 학교 수 입력 받기
            int N = sc.nextInt();

            // 최대 소비량과 해당 학교명을 저장할 변수 초기화
            String maxSchool = "";
            int maxConsumption = -1;

            // 각 학교의 이름과 소비량을 입력 받기
            for(int i = 0; i < N; i++){
                String school = sc.next();
                int consumption = sc.nextInt();

                // 현재 학교의 소비량이 최대 소비량보다 크면 갱신
                if (consumption > maxConsumption){
                    maxConsumption = consumption;
                    maxSchool = school;
                }
            }

            // 최대 소비량을 가진 학교명 출력
            System.out.println(maxSchool);
        }
        sc.close();
    }

}

