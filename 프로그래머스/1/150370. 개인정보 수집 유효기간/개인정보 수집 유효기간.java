import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        ArrayList<Integer> list = new ArrayList<>();

        // 오늘 날짜를 기점으로 (보관날짜 + 만료기간)을 비교해서 구함
        // 모든 달이 28일로 정해졌으므로 날짜 함수 사용 불가능
        // 1. 오늘 날짜를 일수로 치환
        int newToday = dateToDay(today);

        // 2. term를 구분해서 map에 주입
        HashMap<String, Integer> termsMap = new HashMap<>();
        for(String term : terms){
            String[] puts = term.split(" ");
            termsMap.put(puts[0], Integer.parseInt(puts[1])*28);
        }

        // 3. privacies를 구분해서 (보관날짜 + 만료기간)이랑 현재날짜 비교
        for(int i = 0 ; i < privacies.length ; i++){
            String[] termPri = privacies[i].split(" ");
            int maxDay = termsMap.get(termPri[1]) + dateToDay(termPri[0]);
            if(newToday >= maxDay){
                list.add(i+1);
            }
        }


        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    // String 날짜 int 일수로 바꿔주는 함수
    public int dateToDay(String today){
        String[] days = today.split("\\.");
        int year = Integer.parseInt(days[0]);
        int month = Integer.parseInt(days[1]);
        int day = Integer.parseInt(days[2]);

        return year*12*28 + month*28 + day;
    }
}