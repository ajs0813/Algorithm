import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정환이 알고 있는 노래의 개수
        int M = sc.nextInt(); // 정환이 맞히기를 시도할 노래의 개수
        sc.nextLine(); // 다음 줄로 이동하여 버퍼 비우기

        // 노래 정보 저장
        Map<String, List<String>> songMap = new HashMap<>();

        for(int i = 0; i < N; i++){
            int T = sc.nextInt();
            String title = sc.next();
            String[] notes = new String[7];
            for(int j = 0; j < 7; j++){
                notes[j] = sc.next();
            }
            sc.nextLine();

            String key = notes[0] + notes[1] + notes[2];// 첫 세 개의 음으로 키 생성
            songMap.putIfAbsent(key, new ArrayList<>());
            songMap.get(key).add(title);
        }

        // 노래 맞히기 시도

        for(int i = 0; i < M; i++){
            String b1 = sc.next();
            String b2 = sc.next();
            String b3 = sc.next();
            sc.nextLine();

            String key = b1 + b2 + b3;

            if (!songMap.containsKey(key)){
                System.out.println("!");
            } else {
                List<String> matches = songMap.get(key);
                if(matches.size() == 1){
                    System.out.println(matches.get(0));
                } else {
                    System.out.println("?");
                }
            }
        }

        sc.close();
    }

}
