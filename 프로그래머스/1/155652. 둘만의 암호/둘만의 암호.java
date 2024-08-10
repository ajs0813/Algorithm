class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alpahbet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String[] skipCheck = skip.split("");

        for (int i = 0; i < skipCheck.length; i++) {
            alpahbet = alpahbet.replace(skipCheck[i], "");
        }

        String[] alpha = alpahbet.split("");
        String[] str = s.split("");

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (str[i].equals(alpha[j])) {

                    str[i] = alpha[j + index];
                    break;

                }
            }
        }

        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }

        return answer;
    }
}