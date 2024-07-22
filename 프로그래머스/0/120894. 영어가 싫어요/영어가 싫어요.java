import java.util.*;
class Solution {
    public long solution(String numbers) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr = numbers.split("");
        String check = "";
        String result = "";
        long answer = 0;

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for(int i = 0; i < list.size(); i++) {
            check += list.get(i);
            if(check.equals("one")){
                result += "1";
                check = "";
            } else if(check.equals("two")){
                result += "2";
                check = "";
            } else if(check.equals("three")){
                result += "3";
                check = "";
            } else if(check.equals("four")){
                result += "4";
                check = "";
            } else if(check.equals("five")){
                result += "5";
                check = "";
            } else if(check.equals("six")){
                result += "6";
                check = "";
            } else if(check.equals("seven")){
                result += "7";
                check = "";
            } else if(check.equals("eight")){
                result += "8";
                check = "";
            } else if(check.equals("nine")){
                result += "9";
                check = "";
            } else if(check.equals("zero")){
                result += "0";
                check ="";
            }
        }

        answer = Long.parseLong(result);



        return answer;
    }
}