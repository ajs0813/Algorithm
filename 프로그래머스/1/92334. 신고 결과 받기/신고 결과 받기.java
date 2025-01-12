import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 유저별 결과 메일 수를 저장할 배열
        int[] answer = new int[id_list.length];

        // 각 유저가 신고한 ID를 저장하는 Map
        Map<String, Set<String>> reportMap = new HashMap<>();
        // 각 유저가 신고당한 횟수를 저장하는 Map
        Map<String, Integer> reportCount = new HashMap<>();

        // 기본값 초기화
        for(String id : id_list){
            reportMap.put(id, new HashSet<>());
            reportCount.put(id, 0);
        }

        // 신고 정보 처리
        for (String rep : report){
            String[] split = rep.split(" ");
            String reporter = split[0]; // 신고한 사람
            String reported = split[1]; // 신고 당한 사람

            // 중복 신고 방지
            if(reportMap.get(reporter).add(reported)){ // 신고가 이루어질 때마다
                reportCount.put(reported, reportCount.get(reported)+1); // 신고 당한 사람은 +1
            }
        }

        // 정지된 유저 목록 확인
        Set<String> bannedUsers = new HashSet<>();
        for (Map.Entry<String, Integer> entry : reportCount.entrySet()){
            if(entry.getValue() >= k){
                bannedUsers.add(entry.getKey());
            }
        }

        // 결과 메일 계산
        for(int i = 0; i < id_list.length; i++){
            String user = id_list[i];
            int mailCount = 0;

            for(String reported : reportMap.get(user)){
                if(bannedUsers.contains(reported)){
                    mailCount++;
                }
            }
            answer[i] = mailCount;
        }

        return answer;
    }
}