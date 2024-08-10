class Solution {
    public int solution(String s) {
        int answer = 0;
        int yes = 0, no = 0;
        char check = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == check) {
                yes++;
            } else {
                no++;
            }

            if (yes == no) {
                answer++;
                yes = 0;
                no = 0;
                if (i + 1 < s.length()) {
                    check = s.charAt(i + 1);
                }
            }
        }

        // 아직 남아 있는 문자열이 있다면 마지막으로 카운트
        if (yes != 0 || no != 0) {
            answer++;
        }

        return answer;
    }
}