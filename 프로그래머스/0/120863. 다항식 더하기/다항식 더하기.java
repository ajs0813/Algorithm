import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        ArrayList<Integer> numlist = new ArrayList<>();
        ArrayList<String> xlist = new ArrayList<>();
        int check = 0;
        int check2 = 0;
        String[] polynomialArray = polynomial.split(" ");

        for (int i = 0; i < polynomialArray.length; i++) {
            if (polynomialArray[i].contains("x")) {
                xlist.add(polynomialArray[i]);
            } else if (!polynomialArray[i].contains("x") && !polynomialArray[i].contains("+")) {
                numlist.add(Integer.parseInt(polynomialArray[i]));
            }
        }

        for (int i = 0; i < xlist.size(); i++) {
            if (xlist.get(i).equals("x")) {
                xlist.set(i, xlist.get(i).replace("x", "1x"));
            }
            check += Integer.parseInt(xlist.get(i).replace("x", ""));
        }
        for (int i = 0; i < numlist.size(); i++) {
            check2 += numlist.get(i);
        }


        if (check != 0 && check2 == 0) {
            answer = Integer.toString(check) + "x";
        } else if (check == 0 && check2 != 0) {
            answer = Integer.toString(check2);
        } else if (check == 0 && check2 == 0) {
          answer = "0";
        } else {
            answer = Integer.toString(check) + "x" + " + " + Integer.toString(check2);
        }

        if(answer.startsWith("1x")){
            answer = answer.replace("1x", "x");
        }

        return answer;
    }
}