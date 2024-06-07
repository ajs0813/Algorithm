import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[K];

        for(int i = 0; i<K; i++){
            arr[i] = sc.nextInt();
        }

        long max = Arrays.stream(arr).max().orElseThrow();

        long start = 1;
        long end = max;

        while(start <= end){
            long mid = (start + end) / 2;
            long sum = 0;
            for(int i = 0; i<K; i++){ // 잘라진 랜선의 개수 합
                sum += (arr[i] / mid);
            }

            if (sum >= N){
                start = mid + 1;
            } else {
                end = mid -1 ;
            }
        }

        System.out.println(end);
    }
}
