import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Solution sol = new Solution();

        System.out.println((sol.solution(n)));
    }
}


class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        int check =0;

        while(i<=n){
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    check++;
                }
            }

            if(check >= 3){
                answer++;
            }
            check = 0;

            i++;
        }

        return answer;
    }
}