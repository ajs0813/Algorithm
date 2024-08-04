class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ", -1);

        for(int i = 0; i < arr.length; i++) {
            String[] check = arr[i].split("");
            String result = "";
            for(int j = 0; j < arr[i].length(); j++) {
                if(j%2 == 0) {
                    check[j] = check[j].toUpperCase();
                } else {
                    check[j] = check[j].toLowerCase();
                }
                result += check[j];
            }
            arr[i] = result;

        }

        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
            if(i != arr.length - 1) {
                answer += " ";
            }
        }


        return answer;
    }
}