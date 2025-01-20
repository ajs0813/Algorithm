import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int bonusTime = bandage[0]; // 시전시간
        int bandageHeal = bandage[1]; // 초당회복량
        int bonusHeal = bandage[2]; // 추가회복량
        int HP = health; // 체력
        int totalTime = attacks[attacks.length-1][0]; // 전체 걸리는 시간
        int regenCnt = 0; // HP 보너스 시간 카운트
        int currentTime = 0; // 현재시간
        Iterator<int[]> atkSet = Arrays.stream(attacks).iterator(); // 몬스터 공격 세팅
        int[] attackTimeAndDmg = atkSet.next(); // 몬스터 공격 시간, 몬스터 공격 데미지

        while(currentTime < totalTime){
            currentTime++;
            int atkTime = attackTimeAndDmg[0]; // 몬스터 공격 시간
            int atkDmg = attackTimeAndDmg[1]; // 몬스터 공격 데미지
            boolean attacked = false; // 몬스터 공격 여부

            if(currentTime == atkTime){
                attacked = true;
                if(attacked){ // 공격을 받은 순간
                    regenCnt = 0; // 보너스 카운트 0으로
                }
                HP = HP - atkDmg;
                if(currentTime == totalTime){
                    if(HP<=0){
                        return -1;
                    } else {
                        return HP;
                    }
                }
                attackTimeAndDmg = atkSet.next(); // 다음 공격 세팅
                continue;
            }

            if(HP <= 0){
                return -1;
            }

            if(HP < health && HP > 0){ // 데미지를 입었다면
                HP = HP + bandageHeal; // HP 회복 +1
                regenCnt++;

                if(regenCnt == bonusTime){ // 보너스 카운트가 시전시간을 충족하면
                    HP = HP + bonusHeal; // 보너스 HP 추가
                    regenCnt = 0; // 보너스 카운트 초기화
                }
            }
            if(HP > health){
                HP = health;
            }
        }

        answer = HP;
        
        return answer;
    }
}