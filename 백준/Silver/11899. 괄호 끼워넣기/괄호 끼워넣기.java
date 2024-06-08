import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int countFront = 0;
        int countBack = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '('){
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    countFront ++;
                } else {
                    stack.pop();
                }
            }
        }

        countBack = stack.size();

        int total = countFront + countBack;
        System.out.println(total);


    }

}

