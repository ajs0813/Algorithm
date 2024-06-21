class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;

        for (int arrays : array) {
            if (max < arrays) {
                max = arrays;
            }
        }

        int[] count = new int[max+1];
        for (int arrays : array) {
            count[arrays]++;
        }

        int maxCnt = 0;
        for(int i = 0; i<count.length; i++) {
            if(maxCnt < count[i]){
                maxCnt = count[i];
                answer = i;
            } else if(maxCnt == count[i]){
                answer = -1;
            }
        }
        return answer;
    }
}