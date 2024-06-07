import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        int height = 10; // 초기 바닥의 높이는 10

        // 두 번째 그릇부터 문자열을 순회하면서 높이를 계산
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                height += 5;
            } else {
                height += 10;
            }
        }

        System.out.println(height);
    }
}