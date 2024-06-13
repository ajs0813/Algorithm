import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mushrooms = new int[10];
        for (int i = 0; i < 10; i++) {
            mushrooms[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        int closest = 0;

        for (int i = 0; i < 10; i++) {
            sum += mushrooms[i];
            if (Math.abs(100 - sum) <= Math.abs(100 - closest)) {
                closest = sum;
            }
        }

        System.out.println(closest);
    }
}

