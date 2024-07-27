import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < num_list.length; i++) {
            if(n==1){
                if(i>=0 && i<= slicer[1]){
                    list.add(num_list[i]);
                }
            } else if(n==2){
                if(i>=slicer[0]){
                    list.add(num_list[i]);
                }
            } else if(n==3){
                if(i>=slicer[0] && i<=slicer[1]){
                    list.add(num_list[i]);
                }
            } else if(n==4){
                if(i>=slicer[0] && i<= slicer[1]){
                    list.add(num_list[i]);
                    i = i+slicer[2]-1;
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}