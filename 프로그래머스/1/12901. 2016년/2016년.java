import java.time.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate specificDate = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = specificDate.getDayOfWeek();
        answer = dayOfWeek.name().substring(0,3);
        return answer;
    }
}