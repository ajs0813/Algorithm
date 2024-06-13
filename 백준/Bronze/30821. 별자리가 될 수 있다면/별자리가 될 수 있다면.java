import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정다각형 입력
        long count = 1; // int 범위를 넘어버리므로 long 자료형 사용

        for(int i = 0; i < 5; i++){ // 별은 5가지 꼭짓점으로만 이루어짐
            count *= N - i;  // N*(N-1)*(N-2)...(N-4) -> NP5
        }
        
        for(int i = 0; i < 5; i++){
            count /= (i+1);  // -> NP5 / 1*2*3*4*5  -> NC5
        }
        
        System.out.println(count);
        sc.close();
    }
}
