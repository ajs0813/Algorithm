import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int result = 1; // 1부터 시작해서 +1씩 계속 올려가며 확인
        while (true) {
            int count = 0;
            for(int number : numbers){
                if(result % number == 0){ // result는 number의 배수인가?
                    count++;
                }
            }
            if(count >= 3){
                break;
            }
            result++;
        }
        System.out.println(result);
    }
}