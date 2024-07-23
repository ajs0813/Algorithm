import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String check = "";
        ArrayList<String> list = new ArrayList<>();

        String[] S = s.split("");

        for (int i = 0; i < S.length - 1; i++) {
            for (int j = i + 1; j < S.length; j++) {
                if (S[i].equals(S[j])) {
                    list.add(S[i]);
                }
            }
        }

        for (int i = 0; i < S.length; i++) {
            if (!list.contains(S[i])) {
                check += S[i];
            }
        }

        String[] sort = check.split("");

        Arrays.sort(sort);

        for(int i = 0; i < sort.length; i++) {
            answer += sort[i];
        }

        return answer;
    }
}