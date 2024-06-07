import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 단어의 수 입력
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        Set<String> wordSet = new HashSet<>();

        // 단어 입력 및 세트에 추가
        for(int i = 0; i < n; i++){
            words[i] = sc.nextLine();
            wordSet.add(words[i]);
        }

        // 비밀번호와 그 뒤집은 문자열 찾기
        for(String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            if(wordSet.contains(reversedWord)){
                int length = word.length();
                char middleChar = word.charAt(length / 2);
                System.out.println(length + " " + middleChar);
                break;
            }
        }

        sc.close();
    }
}
