class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if(j == indices[i]){
                    str[j] = "";
                }
            }
        }

        for(int i = 0; i < str.length; i++){
            if(!str[i].isBlank()){
                answer += str[i];
            }
        }

        return answer;
    }
}