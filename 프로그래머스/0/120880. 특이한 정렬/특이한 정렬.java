import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] numArray = new Integer[numlist.length];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = numlist[i];
        }

        Arrays.sort(numArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int diff1 = Math.abs(a - n);
                int diff2 = Math.abs(b - n);
                if (diff1 == diff2) {
                    return b - a; // 차이가 같다면 더 큰 수가 앞에 오도록 정렬
                }
                return diff1 - diff2; // 차이에 따라 정렬
            }
        });

        int[] result = new int[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            result[i] = numArray[i];
        }


        return result;
    }
}