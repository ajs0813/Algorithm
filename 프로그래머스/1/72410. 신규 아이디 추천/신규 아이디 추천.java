class Solution {
    public String solution(String new_id) {
        String answer = "";

        // 1단계: 모든 대문자를 소문자로
        new_id = new_id.toLowerCase();

        // 2단계: 소문자, 숫자, (-), (_), (.) 만 남기고 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3단계: .. 2번 이상일 시 하나만 남김
        new_id = new_id.replaceAll("\\.{2,}",".");

        // 4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
        new_id = new_id.replaceAll("^\\.+|\\.+$", "").replaceAll("^\\.|\\.$","");

        // 5단계: 빈 문자열일 시 a대입
        if(new_id.isBlank()){
            new_id += "a";
        }

        // 6단계: 길이 16이상일 시 자르기
        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15);
        }
        new_id = new_id.replaceAll("^\\.+|\\.+$", "").replaceAll("^\\.|\\.$","");

        // 7단계: 길이가 2자 이하라면 마지막 문자 반복
        if(new_id.length() <= 2){
            while(new_id.length() < 3){
                char c = new_id.charAt(new_id.length()-1);
                new_id = new_id + c;
            }
        }
        
        answer = new_id;

        return answer;
    }
}