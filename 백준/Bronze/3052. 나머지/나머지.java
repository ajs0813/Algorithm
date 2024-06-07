import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Long> remainders = new HashSet<>();

        for (int i = 0; i<10; i++){
            long remainder = sc.nextInt()%42;
            remainders.add(remainder);
        }

        System.out.println(remainders.size());
    }
}
