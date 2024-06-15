import org.w3c.dom.Node;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 핸드폰 번호 입력
        String phoneA = sc.next();
        String phoneB = sc.next();

        // Step 1: 결합된 숫자 문자열 생성
        StringBuilder combined = new StringBuilder();
        for(int i = 0; i < 8; i++){
            combined.append(phoneA.charAt(i));
            combined.append(phoneB.charAt(i));
        }

        // Step 2: 숫자 리스트로 변환
        int[] numbers = new int[16];
        for(int i = 0; i < 16; i++){
            numbers[i] = combined.charAt(i) - '0'; // 아스키 코드 값 고려해서 0 빼줌
        }

        // Step 3: 반복해서 숫자 리스트를 축소
        while(numbers.length > 2){
            int[] newNumbers = new int[numbers.length-1];
            for(int i = 0; i< numbers.length -1; i++){
                newNumbers[i] = (numbers[i] + numbers[i+1]) % 10;
            }
            numbers = newNumbers;
        }

        // Step 4: 결과 출력
        System.out.printf("%02d", numbers[0] * 10 + numbers[1]);
    }
}

