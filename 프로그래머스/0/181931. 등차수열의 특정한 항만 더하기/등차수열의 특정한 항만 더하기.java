import java.util.*;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int answer = 0;
        int[] arr = new int[included.length];
        arr[0] = a;
        for(int i = 1; i<arr.length; i++){
            arr[i] += arr[i-1] + d;
        }
        
        for(int j = 0; j<arr.length; j++){
            if(included[j]){
                answer += arr[j];
            }
        }
        
        return answer;
    }
}