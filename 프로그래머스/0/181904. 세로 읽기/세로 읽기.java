class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int counter = 0;

        String[] arr = my_string.split("");
        String[][] check = new String[my_string.length() / m][m];

        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[i].length; j++) {
                check[i][j] = arr[counter++];
            }
        }

        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[i].length; j++) {
                if (j == c - 1) {
                    answer += check[i][j];
                }
            }
        }

        return answer;
    }
}