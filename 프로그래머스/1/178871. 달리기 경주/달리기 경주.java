import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i<players.length; i++){
            map.put(players[i], i);
        }

        for(int i = 0; i<callings.length; i++){
            int calledPlayer = map.get(callings[i]); // kai -> 3
            String calledPlayerName = players[calledPlayer]; // kai
            String changePlayerName = players[calledPlayer -1]; // poe

            String term = players[calledPlayer-1]; // term = 3-1 = 2 = poe
            players[calledPlayer-1] = players[calledPlayer]; // poe(2) <=> kai(3) 뒤 바꿈
            players[calledPlayer] = term; // players[3] = poe

            map.put(calledPlayerName, calledPlayer-1); // kai 2
            map.put(changePlayerName, calledPlayer); // poe 3
        }

        for(int i = 0; i<answer.length; i++){
            answer[i] = players[i];
        }
        
        return answer;
    }
}