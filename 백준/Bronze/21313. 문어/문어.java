import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        String result = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1 && i != n) {
                arr[i] = 1;
            } else if (i % 2 == 1 && i == n) {
                arr[i] = 3;
            } else {
                arr[i] = 2;
            }

            result += arr[i] + " ";
        }

        System.out.println(result);
    }
}