import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        // 입력된 알파벳을 원하는 숫자로 바꿔주는 코드
        int sum = 0;
        for (char c : word.toCharArray()){
            if(Character.isLowerCase(c)){
                sum += c - 'a' + 1;
            } else if (Character.isUpperCase(c)){
                sum += c - 'A' + 27;
            }
        }

        if (isPrime(sum) || sum == 1){
            System.out.println("It is a prime word.");
        } else {
            System.out.println("It is not a prime word.");
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i<=Math.sqrt(num); i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}