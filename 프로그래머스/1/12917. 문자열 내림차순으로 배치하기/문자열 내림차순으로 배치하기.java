class Solution {
    public String solution(String s) {
        String answer = "";

        char[] check = s.toCharArray();

        for (int i = 0; i < check.length-1; i++) {
            for (int j = 0; j < check.length-i-1; j++) {
                if(check[j] < check[j+1]){
                    char temp = check[j+1];
                    check[j+1] = check[j];
                    check[j] = temp;
                }
            }
        }

        for(int i = 0; i < check.length; i++){
            answer += check[i];
        }

        return answer;
    }
}