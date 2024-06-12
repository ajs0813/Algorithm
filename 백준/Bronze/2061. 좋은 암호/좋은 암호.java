import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger K = new BigInteger(sc.next()); //첫 번째 큰 정수
        int L = sc.nextInt();

        // 초기 상태를 true로 설정, 나누어 떨어지는 숫자가 발견되면 false로 변경
        boolean Best = true;

        // 2부터 L-1까지의 숫자로 K를 나눔
        for(int i = 2; i < L; i++){
            // K를 i로 나눴을 때 나머지가 0인 경우
            if(K.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
                Best = false; // Best를 false로 설정
                System.out.println("BAD " + i);
                break;
            }
        }

        if(Best){
            System.out.println("GOOD");
        }
    }
}

