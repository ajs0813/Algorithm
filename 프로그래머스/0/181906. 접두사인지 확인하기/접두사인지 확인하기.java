class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String check ="";
        String[] arr = my_string.split("");

        for(int i = 0; i<arr.length; i++){
            check += arr[i];
            if(check.equals(is_prefix)){
                answer = 1;
            }
        }

        return answer;
    }
}