class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        String[] str = my_string.split("");
        String temp = "";

        for (int i = 0; i < str.length; i++) {
            if(i>=s && i<=e){
                temp = str[i];
                str[i] = str[e];
                str[e] = temp;
                e--;
            }
        }

        answer = String.join("", str);


        return answer;
    }
}