import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 각 카드의 이름과 수를 지정할 Map(타입, 타입) 생성
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            String key = sc.next();
            int value = sc.nextInt();
            map.put(key,value);

            if(key.equals("STRAWBERRY")){
                A += map.get(key);
            } else if(key.equals("BANANA")){
                B += map.get(key);
            } else if(key.equals("LIME")){
                C += map.get(key);
            } else if(key.equals("PLUM")){
                D += map.get(key);
            }

        }

        if(A==5 || B==5 || C==5 || D==5){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
