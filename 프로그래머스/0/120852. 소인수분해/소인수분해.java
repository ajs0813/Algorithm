import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 2; i <= n; i++){ // 소인수는 2부터 시작하기 때문에
            if(n % i == 0){ // n의 약수일 경우 ex) n = 60일 경우 i = 2
                while(n % i == 0){ // 약수가 n을 쪼갤 수 있는 최대한 쪼개줌
                    n /= i; // 60/2 = 30/2 = 15 => n은 15가 되었고 for문을 통해 다음 숫자가  15를 마저 나눠줄 것
                }
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}