class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] check = {};

        for (int i = 0; i < quiz.length; i++) {
            check = quiz[i].split(" ");


            if (check[1].equals("-")) {
                if (Integer.parseInt(check[0]) - Integer.parseInt(check[2]) == Integer.parseInt(check[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
            if (check[1].equals("+")) {
                if (Integer.parseInt(check[0]) + Integer.parseInt(check[2]) == Integer.parseInt(check[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }


        return answer;
    }
}