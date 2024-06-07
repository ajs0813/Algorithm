import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int j = 0; j < T; j++) {

            String P = "";
            int R = sc.nextInt();
            String S = sc.next();

            String arr[] = S.split("");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].repeat(R);

                P += arr[i];
            }

            System.out.println(P);

        }

    }
}