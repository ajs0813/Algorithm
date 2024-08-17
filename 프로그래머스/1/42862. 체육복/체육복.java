import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Set<Integer> reserveSet = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();

        // 1. 체육복 여분이 남은 학생들
        for(int i : reserve){
            reserveSet.add(i);
        }

        // 2. 도둑 당한 학생들
        for(int i : lost){
            if(reserveSet.contains(i)) {
                reserveSet.remove(i); // 체육복 여분이 있었지만 도둑 당한 학생들
            } else {
                lostSet.add(i); // 그냥 도둑 당한 학생들
            }
        }



        // 3. 여분의 체육복을 나눠줌
        Iterator<Integer> iter = reserveSet.iterator();

        while(iter.hasNext()){
            int i = iter.next();
            if(lostSet.contains(i-1)){
                lostSet.remove(i-1);
                iter.remove();
            } else if (lostSet.contains(i+1)){
                lostSet.remove(i+1);
                iter.remove();
            }
        }

        answer = n - lostSet.size();


        return answer;
    }
}