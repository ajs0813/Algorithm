class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;

        String str = Integer.toBinaryString(n);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1'){
                cnt++;
            }
        }

        while(true){
            n = n+1;

            String nextStr = Integer.toBinaryString(n);
            int nextCnt = 0;
            for (int i = 0; i < nextStr.length(); i++) {
                if(nextStr.charAt(i) == '1'){
                    nextCnt++;
                }
            }

            if(nextCnt == cnt){
                answer = n;
                break;
            }
        }

        return answer;
    }
}