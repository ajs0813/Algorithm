class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] Xarr = new int[10];
        int[] Yarr = new int[10];

        for (int i = 0; i < X.length(); i++) {
            Xarr[X.charAt(i) - '0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            Yarr[Y.charAt(i) - '0']++;
        }

        int[] same = new int[10];

        for (int i = 0; i < same.length; i++) {
            if (Xarr[i] != 0 && Yarr[i] != 0) {
                same[i] = Math.min(Xarr[i], Yarr[i]);
            }
        }

        StringBuilder sb = new StringBuilder(answer);

        for (int i = same.length - 1; i >= 0; i--) {
            for (int j = same[i]; j > 0; j--) {
                sb.append(i);
            }
        }

        answer = sb.toString();

        if (answer.isBlank()) {
            answer = "-1";
        }

        if (answer.startsWith("0")) {
            answer = "0";
        }

        return answer;
    }
}