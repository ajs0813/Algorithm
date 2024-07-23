import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 결과 값은 각 스테이지의 실패율
        int[] stageFailCount = new int[N]; // 스테이지별 실패 인원
        int[] stageTryCount = new int[N]; // 스테이지별 도전 인원
        double[] fail = new double[N]; // 스테이지별 실패율

        // 각 스테이지별 실패한 인원 구하는 for문
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    stageFailCount[i]++;
                }
            }
        }

        // 각 스테이지별 도전 인원 구하는 for문
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i + 1) {
                    stageTryCount[i]++;
                }
            }
        }

        // 각 스테이지별 실패율 구하는 for문
        for (int i = 0; i < N; i++) {
            if(stageTryCount[i] != 0) {
            fail[i] = (double) stageFailCount[i] / stageTryCount[i];
            } else {
                fail[i] = 0;
            }
        }

        double min = 0.000001;
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i!=j && fail[i] == fail[j]){
                    fail[j] -= min;
                }
            }
        }

        double[] failCopy = fail.clone();
        Arrays.sort(failCopy);
        double[] reverseFail = new double[N];

        for (int i = 0; i < N; i++) {
            reverseFail[i] = failCopy[N - i - 1];
        }






        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (fail[i] == reverseFail[j]) { // fail은 스테이지별 실패율을 가지고 있고 reverseFail은 실패율의 내림차순, 양측의 순서를 맞춰준다면...
                    answer[j] = i + 1; // j가 내림차순에서 스테이지 번호가 있어야 할 위치, i+1 스테이지 번호
                }

            }
        }


        return answer;
    }
}