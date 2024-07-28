class Solution {
    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[101];
        int j = 1;

        for (int i = 1; i <= 100; i++) {

            arr[i] = j;
            j++;

            while(j%3 == 0 || Integer.toString(j).contains("3")){
                j++;
            }

        }

        answer = arr[n];

        return answer;
    }
}