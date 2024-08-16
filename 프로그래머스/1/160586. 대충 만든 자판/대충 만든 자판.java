import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < targets.length; i++) {
            int idx = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                for (int k = 0; k < keymap.length; k++) {
                    idx = keymap[k].indexOf(targets[i].charAt(j));
                    if (idx != -1) {
                        list.add(idx + 1);
                    }
                }
                if (list.isEmpty()) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += Collections.min(list);
                    list.clear();
                }
            }
        }

        return answer;
    }
}