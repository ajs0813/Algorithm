class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char[] codeArr = code.toCharArray();

        for(int i = 0; i<codeArr.length; i++){
            if(mode == 0){
                if(i%2 == 0 && codeArr[i] != '1'){
                    answer += codeArr[i];
                }
                if(codeArr[i]=='1'){
                    mode = 1;
                    continue;
                }
            }

            if(mode == 1){
                if(i%2 == 1 && codeArr[i] != '1'){
                    answer += codeArr[i];
                }
                if(codeArr[i]=='1'){
                    mode = 0;
                }
            }
        }

        if(answer.length() == 0){
            answer = "EMPTY";
        }

        return answer;
    }
}