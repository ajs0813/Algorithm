class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String kstr = Integer.toString(k);
        String numstr = Integer.toString(num);
        
        int index = numstr.indexOf(kstr);
        
        if (index == -1){
            return -1;
        } else {
            answer = index +1;
        }
        
        return answer;
    }
}