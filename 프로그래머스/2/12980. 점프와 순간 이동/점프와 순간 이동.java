class Solution {
    public int solution(int n) {
        int ans = 0;

        while(true){

            if(n % 2 == 0){
                n /= 2;
            } else {
                n = n -1;
                ans++;
                n /= 2;
            }

            if(n == 0){
                break;
            }
            
        }

        return ans;
    }
}