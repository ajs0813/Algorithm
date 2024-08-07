import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int choice = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        Iterator<Integer> iterator = set.iterator();

        for(int i = 0; i < choice; i++) {
            if(iterator.hasNext()) {
                list.add(iterator.next());
            }
        }



        answer = list.size();

        return answer;
    }
}