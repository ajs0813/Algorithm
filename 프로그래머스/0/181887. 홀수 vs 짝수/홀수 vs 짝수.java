class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int check1 = 0;
        int check2 = 0;
        for(int i = 0; i< num_list.length; i++){
            if(i%2 == 0){
                check1 += num_list[i];
            }
            if(i%2 == 1){
                check2 += num_list[i];
            }
        }
        
        answer = check1 > check2 ? check1 : check2;
        
        return answer;
    }
}