class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        String str = "";
        String check = "";
        int cntZero = 0;
        int cntBinary = 0;
        String list[] = new String[s.length()];

        while (true) {

            cntBinary++;

            list = s.split("");
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals("0")) {
                    cntZero++;
                    list[i] = "";
                }
                str += list[i];
            }

            check = Integer.toBinaryString(str.length());

            if (check.equals("1")) {
                answer[0] = cntBinary;
                answer[1] = cntZero;
                break;
            } else {
                s = check;
                str = "";
            }
        }

        return answer;

    }
}