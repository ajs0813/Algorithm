class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.replace("A","X").replace("B","A").replace("X","B");
        
        if(str.contains(pat)){
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}