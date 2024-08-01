import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};
        // 발음 가능한 모든 조합을 저장할 Set
        Set<String> validCombinations = new HashSet<>();

        // 가능한 모든 발음 조합 생성
        generateCombinations(sounds, "", validCombinations);

        // 주어진 문자열 배열에서 발음 가능한 단어의 개수 세기
        for(String word : babbling){
            if(validCombinations.contains(word)){
                answer++;
            }
        }

        return answer;
    }

    // 재귀를 사용하여 모든 발음 조합 생성
    public void generateCombinations(String[] sounds, String current, Set<String> validCombinations) {
        if(!current.isEmpty()){
            validCombinations.add(current);
        }
        for(String sound : sounds){
            if(!current.contains(sound)){ // 중복된 발음이 없는지 확인
                generateCombinations(sounds, current + sound, validCombinations);
                // 미친놈 진짜 기가막히게 똑똑하네 for -> 재귀 -> for -> 재귀 순환하면서 모든 경우 체킹
            }
        }
    }
}