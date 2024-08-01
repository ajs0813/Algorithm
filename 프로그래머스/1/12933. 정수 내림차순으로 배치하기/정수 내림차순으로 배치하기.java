import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);

        String[] arr = str.split("");
        
        Arrays.sort(arr);
        
        String[] copy = new String[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            copy[arr.length-1-i] = arr[i];
        }
        
        String result = String.join("", copy);
        
        answer = Long.parseLong(result);

        return answer;
    }
}