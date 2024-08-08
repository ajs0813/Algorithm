class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i + 1; j < nums.length-1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(PN(nums[i], nums[j], nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean PN(int a, int b, int c){

        int check = a+b+c;
        int start = 1;
        int cnt = 0;
        while(start<=check){
            if(check%start == 0){
                cnt++;
            }
            start++;
        }

        if (cnt == 2){
            return true;
        } else {
            return false;
        }
    }
}