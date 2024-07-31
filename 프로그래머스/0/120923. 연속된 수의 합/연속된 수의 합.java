class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int test = -100;
        for (int i = 0; i < num; i++) {
            answer[i] = test;
            test++;
        }

        while (true) {
            int result = 0;
            for (int i = 0; i < answer.length; i++) {
                result += answer[i];
            }

            if (result == total) {
                break;
            } else {
                for (int i = 0; i < answer.length; i++) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}