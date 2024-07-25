import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p = 0;
        int q = 0;
        int r = Integer.MAX_VALUE;
        int[] dice = new int[6];

        dice[a - 1] += 1;
        dice[b - 1] += 1;
        dice[c - 1] += 1;
        dice[d - 1] += 1;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] > 0) {
                list.add(dice[i]);
            }
        }

        Collections.sort(list);

        if(list.size() == 1){ // list 사이즈가 1이면 네 개의 숫자가 모두 같은 셈
            for(int i = 0; i < dice.length; i++){
                if(dice[i] == 4){
                    answer = 1111*(i+1);
                }
            }
        } else if(list.size() == 2 && !Objects.equals(list.get(0), list.get(1))){ // list 사이즈가 2면서 서로 숫자가 다르면 3개의 숫자가 같고 1개가 다름
            for(int i = 0; i < dice.length; i++){
                if(dice[i] == 3){
                    p = i+1;
                } else if(dice[i] == 1){
                    q = i+1;
                }
            }

            answer = (10*p+q) * (10*p+q);
        } else if(list.size() == 2 && Objects.equals(list.get(0), list.get(1))){ // list 사이즈가 2면서 서로 숫자가 같으면 2개의 숫자가 같고 2개가 다름
            for(int i = 0; i < dice.length; i++){
                if(dice[i] == 2 && p ==0){
                    p = i+1;
                } else if (dice[i] == 2 && q ==0){
                    q = i+1;
                }
            }

            answer = (p+q) * Math.abs(p-q);
        } else if(list.size() == 3){ // list 사이즈가 3이라면 같은 수 2개, 다른 수 1개, 1개
            for(int i = 0; i < dice.length; i++){
                if(dice[i] == 2){
                    p = i+1;
                }
                if(dice[i] == 1 && q ==0){
                    q = i+1;
                } else if (dice[i] == 1){
                    r = i+1;
                }
            }
            answer = q*r;
        } else {
            for(int i = 0; i < dice.length; i++){
                if(dice[i] == 1){
                    r = Math.min(r, dice[i]*(i+1));
                }
            }
            answer = r;
        }


        return answer;
    }
}