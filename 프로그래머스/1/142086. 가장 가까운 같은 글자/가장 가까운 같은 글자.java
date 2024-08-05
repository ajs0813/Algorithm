class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String[] str = s.split("");
        int[] check = new int[str.length];
        int count = 0;
        check[0] = -1;

        for (int i = 1; i < str.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (str[i].equals(str[j])) {
                    check[i] = i - j;
                    break;
                } else {
                    check[i] = -1;
                }
            }
        }
        
        answer = check.clone();


        return answer;
    }
}