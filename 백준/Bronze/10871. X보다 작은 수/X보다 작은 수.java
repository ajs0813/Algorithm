import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        String answer = "";

        for(int i=0; i<N; i++){
            int a = scan.nextInt();
            if(a < X){
                answer += a;
                answer += " ";
            }
        }

        System.out.println(answer);
    }
}