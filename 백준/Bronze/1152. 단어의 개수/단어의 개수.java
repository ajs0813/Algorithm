import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arraylist = new ArrayList<>();


        String str = sc.nextLine().trim();

        String[] arr = str.split(" ");

        for(int i = 0; i<arr.length; i++){
            if(!arr[i].isEmpty()){
                arraylist.add(arr[i]);
            }
        }

        // ArrayList와 Array는 타입이 달라 호환이 안되기에 Array를 Arrays.asList를 이용해 List화 함
        // arraylist.addAll(Arrays.asList(str.split(" "))); 가변인자 문제로 컴파일 에러




        System.out.println(arraylist.size());





    }
}
