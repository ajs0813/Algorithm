class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int nowBottle = n;
        int leftBottle = 0;
        int Cola = 0;


        while(nowBottle >= a){
            leftBottle = nowBottle%a; // 2
            Cola += (nowBottle/a)*b;
            nowBottle = (nowBottle/a)*b + leftBottle;

        }

        answer = Cola;

        return answer;
    }
}