import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        // 1. 일단 점수와 / 보너스를 분리해보려고 함
        String[] checkNum = dartResult.split("\\D+");
        int[] point = new int[checkNum.length];
        for (int i = 0; i < checkNum.length; i++) {
            point[i] = Integer.parseInt(checkNum[i]);
        }
        // 정규 표현식을 활용해서 숫자만 남기고 다 날려버림


        // 2. 보너스 항목도 정규 표현식 이용해서 숫자만 날려버림
        String[] str = dartResult.split("\\d+");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) {
                list.add(str[i]);
            }
        }
        // 공백이 남아 있을 수 있기에 공백이 아닌 경우만 리스트에 담아줬음


        // 3. 이렇게 하면 경우의 수 얼마 안나와서 그냥 다 때려박음
        for (int i = 0; i < checkNum.length; i++) {

            if (list.get(i).equals("S")) {
                point[i] = point[i];
            } else if (list.get(i).equals("D")) {
                point[i] = point[i] * point[i];
            } else if (list.get(i).equals("T")) {
                point[i] = point[i] * point[i] * point[i];
            } else if (list.get(i).equals("S*")) {
                point[i] = point[i] * 2;
                if (i == 1) {
                    point[0] = point[0] * 2;
                } else if (i == 2) {
                    point[1] = point[1] * 2;
                }
            } else if (list.get(i).equals("D*")) {
                point[i] = point[i] * point[i] * 2;
                if (i == 1) {
                    point[0] = point[0] * 2;
                } else if (i == 2) {
                    point[1] = point[1] * 2;
                }
            } else if (list.get(i).equals("T*")) {
                point[i] = point[i] * point[i] * point[i] * 2;
                if (i == 1) {
                    point[0] = point[0] * 2;
                } else if (i == 2) {
                    point[1] = point[1] * 2;
                }
            } else if (list.get(i).equals("S#")) {
                point[i] = point[i] * (-1);
            } else if (list.get(i).equals("D#")) {
                point[i] = point[i] * point[i] * (-1);
            } else if (list.get(i).equals("T#")) {
                point[i] = point[i] * point[i] * point[i] * (-1);
            }


        }

        answer = point[0] + point[1] + point[2];

        return answer;
    }
}