import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emergencyClone = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            emergencyClone[i] = emergency[i];
        }
        Arrays.sort(emergencyClone);
        int[] reverse = new int[emergencyClone.length];

        // 리버스 배열의 인덱스+1은 곧 우선 순위와도 같음
        for (int i = 0; i < emergencyClone.length; i++) {
            reverse[i] = emergencyClone[emergencyClone.length - 1 - i];
        }

        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] == reverse[j]){
                    answer[i] = j+1;
                }
            }
        }
        return answer;
    }
}