import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // 1. 원하는 제품과 수량을 Map에 저장
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }

        // 2. 슬라이딩 윈도우 방식으로 10일 간의 할인 제품 확인
        for(int i = 0; i<=discount.length - 10; i++){
            // 현재 10일 동안의 할인 제품 수를 계산
            Map<String, Integer> discountMap = new HashMap<>();
            for(int j = i; j < i+10; j++){
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0)+1);
            }

            // 3. 현재 할인 제품이 원하는 제품과 수량을 모두 만족하는지 확인
            boolean isMatch = true;
            for(String product : map.keySet()){
                if(discountMap.getOrDefault(product, 0) < map.get(product)){
                    isMatch = false;
                    break;
                }
            }

            if(isMatch){
                answer++;
            }
        }


        return answer;
    }
}