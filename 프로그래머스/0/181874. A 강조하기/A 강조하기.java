class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if(c == 'a'){
                answer.append("A");
            }
            if(c == 'A'){
                answer.append("A");
            }
            if(Character.isUpperCase(c) && c != 'A'){
                answer.append(Character.toLowerCase(c));
            }
            if(Character.isLowerCase(c) && c != 'a'){
                answer.append(c);
            }
            if(c == ' '){
                answer.append(c);
            }
        }


        return String.valueOf(answer);
    }
}