class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int coupon = chicken;
        int serviceChicken = 0;
        int serviceChickenCount = 0;

        while(true){
            serviceChicken = 0;
            if(coupon >= 10){
                serviceChicken += coupon/10;
                coupon = coupon - (serviceChicken*10);
            }
            serviceChickenCount = serviceChickenCount + serviceChicken;
            if(serviceChicken > 0){
                coupon += serviceChicken;
            }
            if(coupon < 10){
                break;
            }
        }

        answer = serviceChickenCount;

        return answer;
    }
}