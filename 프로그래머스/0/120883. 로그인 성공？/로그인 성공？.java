class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for (int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1])) {
                answer = "login";
            }

            if(db[i][0].equals(id_pw[0]) && !db[i][1].equals(id_pw[1])) {
                answer = "wrong pw";
            }

            if(!db[i][0].equals(id_pw[0]) && !db[i][1].equals(id_pw[1])) {
                answer = "fail";
            }
        }

        return answer;
    }
}