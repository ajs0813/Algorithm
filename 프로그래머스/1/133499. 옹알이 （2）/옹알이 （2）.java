class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"};

        for(String word : babbling){
            boolean isValid = true;

            // 동일한 발음이 연속해서 사용되는지 확인
            for(String b : baby){
                if(word.contains(b+b)){
                    isValid = false;
                    break;
                }
            }

            // 연속 발음이 없으면 전체 문자열 검사
            if(isValid){
                String pattern = "^(aya|ye|woo|ma)+$";
                if(word.matches(pattern)){
                    answer++;
                }
            }
        }
        return answer;
    }
}