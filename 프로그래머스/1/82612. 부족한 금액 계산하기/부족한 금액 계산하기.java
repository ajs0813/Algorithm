
class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        int x = 1;
        long fee = 0;
        while(x<=count){
            fee += price;
            money -= fee;
            x++;
        }

        if(money < 0) {
            answer = money * (-1);
        } else {
            answer = 0;
        }
        return answer;
    }
}