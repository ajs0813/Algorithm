import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int[] people = new int[n];
        int cnt = 0; // 끝말잇기 카운트
        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {

            if (i == 0) { // 끝말잇기 처음 시작일 때 초기값 넣어줌
                set.add(words[i]);
                people[0]++; // 첫사람 1번 함
                cnt++;
            } else { // 이후 끝말잇기 시작
                char cLast = words[i - 1].charAt(words[i - 1].length() - 1);
                char cStart = words[i].charAt(0);

                if(cStart == cLast && !set.contains(words[i])) { //  끝말잇기 글자가 맞고, set에 중복된 값이 없다면
                    set.add(words[i]); // 셋에 값 넣어줌
                    people[i%n]++; // 현재 사람 1번 했다고 카운트 해줌
                    cnt++; // 전체 끝말잇기도 카운트 해줌
                    if(cnt == words.length){ // 끝말잇기가 다 카운트 되어도 패배자가 없다면
                        answer[0] = 0;
                        answer[1] = 0;
                        return answer;
                    }
                } else if(cStart != cLast || set.contains(words[i])){ // 끝말잇기가 누군가의 패배로 끝난다면
                    answer[0] = (i%n)+1; // 패배한 사람 넘버링
                    answer[1] = people[(i%n)]+1; // 패배한 사람 몇번째에서 패배했나
                    return answer;
                }
            }
        }
        return answer;
    }
}