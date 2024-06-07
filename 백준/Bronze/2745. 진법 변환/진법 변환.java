import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        char[] text = sc.next().toCharArray();
        int N = sc.nextInt();
        int A[] = new int[text.length];

        for(int i =0; i<text.length; i++){
            if(47<text[i] && text[i] < 58){
                A[i] = Integer.parseInt(String.valueOf(text[i]));
            } else {
                A[i] = text[i] - 55;
            }
        }

        int result = A[A.length-1];
        int temp = N;
        for(int i = A.length-2; i>=0; i--){
            result += A[i] * temp;
            temp = temp*N;
        }

        System.out.println(result);

    }
}
