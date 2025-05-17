import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> clothesTypes = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1]; // 종류
            clothesTypes.put(type, clothesTypes.getOrDefault(type, 0) +1);

        }

        for(int count : clothesTypes.values()){
            answer *= count + 1;
        }
        return answer - 1;
    }
}
