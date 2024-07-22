class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        char[] arr = number.toCharArray();

        for(char arrays : arr){
            sum += Integer.parseInt(String.valueOf(arrays));
        }

        answer = sum%9;

        return answer;
    }
}