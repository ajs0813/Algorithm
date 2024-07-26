import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        int i = 0;
        int j = 0;

        while(i<=sides[1]) {
            if(i+sides[0] > sides[1] && i<=sides[1]) {
                answer++;
            }
            i++;
        }

       while(j<sides[0]+sides[1]){
           if(j>sides[1] && j< sides[0]+sides[1]){
               answer++;
           }
           j++;
       }

        return answer;
    }
}