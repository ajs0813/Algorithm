import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        
        int count = Integer.bitCount(X);  // X의 이진수에서 1의 개수 세기
        System.out.println(count);
    }
}
