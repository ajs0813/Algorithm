class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String check = "";

        check = my_string.replaceAll("[^\\d]", " ");

        String[] test = check.split(" ");

        for (int i = 0; i < test.length; i++) {
            if (!test[i].isBlank()) {
                answer += Integer.valueOf(test[i]);
            }
        }

        return answer;
    }
}