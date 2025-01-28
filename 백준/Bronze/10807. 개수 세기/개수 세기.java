import java.util.*;
class Main{
    public static void main(String[] args){
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i<a; i++){
            arr[i] = scan.nextInt();
        }
        
        int b = scan.nextInt();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == b){
                answer++;
            }
        }
        
        System.out.print(answer);
    }
}