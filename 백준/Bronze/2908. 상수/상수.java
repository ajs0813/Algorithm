import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        String A = sc.next();
        String B = sc.next();

        // 문자열을 뒤집기 위한 reverse를 쓰기 위해 StringBuilder 클래스 불러줌
        String reverseStr1 = new StringBuilder(A).reverse().toString();
        String reverseStr2 = new StringBuilder(B).reverse().toString();
        /* Java의 StringBuilder 클래스에서 reverse() 메서드는 StringBuilder 객체 자체를 수정하여 문자열을 뒤집습니다.
           따라서 reverse() 메서드의 반환 값은 StringBuilder 객체 자체이며
           이는 문자열을 포함하고 있는데, 이를 문자열로 바꾸려면 toString() 메서드를 사용해야 합니다.*/

        int reverseA = Integer.parseInt(reverseStr1);
        int reverseB = Integer.parseInt(reverseStr2);

        if (reverseA > reverseB){
            System.out.println(reverseStr1);
        } else{
            System.out.println(reverseStr2);
        };



    }
}
