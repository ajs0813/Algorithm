class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        int[] check = new int[right-left+1];
        int[] count = new int[check.length];

        for(int i = 0 ; i < check.length; i++){
            check[i] = left;
            left++;
        }

        for(int i = 0 ; i < count.length; i++){
            count[i] = yaksuCount(check[i]);
        }

        for(int i = 0 ; i < count.length; i++){
            if(count[i] %2 == 0){
                answer += check[i];
            } else {
                answer -= check[i];
            }
        }



        return answer;
    }

    public int yaksuCount(int num){
        int cnt = 0;
        int x = 1;

        while(x<=num){
            if(num%x==0){
                cnt++;
            }
            x++;
        }

        return cnt;
    }
}