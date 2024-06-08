import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int countI = 1;
        int countJ = 0;
       for (int i = 0; i < N; i++) {
           for (int j = 0; j < N; j++) {
               if(countI == i && countJ == j){
                   System.out.print(" ");
                   if(countJ < i-1) countJ++;
               } else{
                   System.out.print("*");
               }
           }
           System.out.println();
           countJ = 0;
           if(i != 0){
               countI++;
           }
       }
    }
}

