class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        String[] arr = str.split("");
        int check = 0;
        for(int i = 0; i < arr.length; i++) {
            check += Integer.parseInt(arr[i]);
        }
        
        if(x%check == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}