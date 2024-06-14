import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] shop = new int[N]; // 가게 갯수
        int[] count = new int[N]; // 영일이가 index 가게부터 마실 경우의 우유 카운트
        int current = 0; // 영일이가 현재 어떤 우유를 마신 상태인가 표시

        for (int i = 0; i < N; i++) {
            shop[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {// 영일이가 마시기 시작한 가게 index 번호
            count[i] = 0;
            current = shop[i];
            if (current == 0) { // 영일이는 시작이 딸기우유가 아니면 우유 안마심
                count[i] = 1;
                for (int j = i + 1; j < shop.length; j++) { // 영일이가 index 번호부터 시작해 순회할 가게들
                    if (current == 0 && shop[j] == 1) {
                        count[i]++;
                        current = shop[j];
                    } else if (current == 1 && shop[j] == 2) {
                        count[i]++;
                        current = shop[j];
                    } else if (current == 2 && shop[j] == 0) {
                        count[i]++;
                        current = shop[j];
                    }
                }
            }
        }

        Arrays.sort(count);
        System.out.println(count[N - 1]);
    }
}

