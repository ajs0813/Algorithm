import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 산봉우리 갯수

        int[] mountains = new int[N];
        int[] count = new int[N];

        for (int i = 0; i < N; i++) { // 산봉우리 높이 부여
            mountains[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                count[i] = 0;
                break;
            } else {
                for (int j = i + 1; j < mountains.length; j++) {
                    if (mountains[i] > mountains[j]) {
                        count[i]++;
                    } else {
                        break;
                    }
                }
            }
        }

        Arrays.sort(count);

        System.out.print(count[N - 1]);
    }
}

