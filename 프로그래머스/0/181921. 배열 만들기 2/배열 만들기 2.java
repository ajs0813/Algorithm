import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        String numStr ="";

        for(int i = l; i <= r; i++){
            numStr = String.valueOf(i);
            if(!(numStr.contains("1") || numStr.contains("2") || numStr.contains("3") || numStr.contains("4") || numStr.contains("6") || numStr.contains("7") || numStr.contains("8") || numStr.contains("9"))){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            list.add(-1);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}