class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] str = new String[array.length];

        for(int i = 0; i < array.length; i++) {
            str[i] = Integer.toString(array[i]);
        }

        String check = String.join("", str);
        String[] check2 = check.split("");

        for(int i = 0; i < check2.length; i++) {
            if(check2[i].equals("7")) {
                answer++;
            }
        }

        return answer;
    }
}