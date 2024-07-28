import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] check  = new int[arr.length];

        int check1 = 0;
        int check2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2){
                check[i]++;
            }
        }

        for(int i = 0; i < check.length; i++){
            if(check[i] == 1){
                check1 = i;
                break;
            }
        }

        for(int i = check.length -1; i>=0; i--){
            if(check[i] == 1){
                check2 = i;
                break;
            }
        }

        int[] answer = Arrays.copyOfRange(arr, check1, check2+1);

        if(answer[0] != 2){
            answer[0] = -1;
        }

        return answer;
    }
}