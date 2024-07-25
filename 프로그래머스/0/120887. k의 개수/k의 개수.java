class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String test = "";
        int q = i;
        int[] check = new int[j-i+1];

        for(int a = 0; a<j-i+1; a++){
            check[a] = q;
            q++;
        }

        for(int a = 0; a<j-i+1; a++){
            test += Integer.toString(check[a]);
        }

        String[] str = test.split("");

        for(int a = 0; a<test.length(); a++){
            if(Integer.parseInt(str[a]) == k){
                answer++;
            }
        }

        return answer;
    }
}