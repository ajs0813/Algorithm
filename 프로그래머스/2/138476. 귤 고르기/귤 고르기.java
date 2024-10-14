import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {

        // 귤 크기별 빈도를 저장할 Map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // 각 귤 크기의 빈도를 계산
        for(int size : tangerine){
            frequencyMap.put(size, frequencyMap.getOrDefault(size, 0) + 1);
        }

        // 빈도를 내림차순으로 정렬하기 위해 List에 빈도만 저장
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        frequencies.sort(Collections.reverseOrder()); // 내림차순 정렬

        int count = 0; // 선택된 귤의 개수
        int answer = 0; // 귤 종류의 수

        // 빈도가 높은 귤부터 선택
        for(int freq : frequencies){
            count += freq;
            answer++; // 선택한 귤 종류 하나 추가
            if(count >= k) { // k개를 모두 선택하면 종류
                break;
            }
        }

        return answer;
    }
}