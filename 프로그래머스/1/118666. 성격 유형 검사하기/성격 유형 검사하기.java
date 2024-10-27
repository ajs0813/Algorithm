class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int rtPoint = 0;
        int cfPoint = 0;
        int jmPoint = 0;
        int anPoint = 0;

        for (int i = 0; i < survey.length; i++) {
            if (survey[i].equals("RT")) {
                switch (choices[i]) {
                    case 1:
                        rtPoint -= 3;
                        break;
                    case 2:
                        rtPoint -= 2;
                        break;
                    case 3:
                        rtPoint -= 1;
                        break;
                    case 4:
                        break;
                    case 5:
                        rtPoint += 1;
                        break;
                    case 6:
                        rtPoint += 2;
                        break;
                    case 7:
                        rtPoint += 3;
                        break;

                }
            } else if (survey[i].equals("TR")) {
                switch (choices[i]) {
                    case 1:
                        rtPoint += 3;
                        break;
                    case 2:
                        rtPoint += 2;
                        break;
                    case 3:
                        rtPoint += 1;
                        break;
                    case 4:
                        break;
                    case 5:
                        rtPoint -= 1;
                        break;
                    case 6:
                        rtPoint -= 2;
                        break;
                    case 7:
                        rtPoint -= 3;
                        break;

                }

            } else if (survey[i].equals("FC")) {
                switch (choices[i]) {
                    case 1:
                        cfPoint += 3;
                        break;
                    case 2:
                        cfPoint += 2;
                        break;
                    case 3:
                        cfPoint += 1;
                        break;
                    case 4:
                        break;
                    case 5:
                        cfPoint -= 1;
                        break;
                    case 6:
                        cfPoint -= 2;
                        break;
                    case 7:
                        cfPoint -= 3;
                        break;

                }

            } else if (survey[i].equals("CF")) {
                switch (choices[i]) {
                    case 1:
                        cfPoint -= 3;
                        break;
                    case 2:
                        cfPoint -= 2;
                        break;
                    case 3:
                        cfPoint -= 1;
                        break;
                    case 4:
                        break;
                    case 5:
                        cfPoint += 1;
                        break;
                    case 6:
                        cfPoint += 2;
                        break;
                    case 7:
                        cfPoint += 3;
                        break;

                }

            } else if (survey[i].equals("MJ")) {
                switch (choices[i]) {
                    case 1:
                        jmPoint += 3;
                        break;
                    case 2:
                        jmPoint += 2;
                        break;
                    case 3:
                        jmPoint += 1;
                        break;
                    case 4:
                        break;
                    case 5:
                        jmPoint -= 1;
                        break;
                    case 6:
                        jmPoint -= 2;
                        break;
                    case 7:
                        jmPoint -= 3;
                        break;

                }

            } else if (survey[i].equals("JM")) {
                switch (choices[i]) {
                    case 1:
                        jmPoint -= 3;
                        break;
                    case 2:
                        jmPoint -= 2;
                        break;
                    case 3:
                        jmPoint -= 1;
                        break;
                    case 4:
                        break;
                    case 5:
                        jmPoint += 1;
                        break;
                    case 6:
                        jmPoint += 2;
                        break;
                    case 7:
                        jmPoint += 3;
                        break;

                }

            } else if (survey[i].equals("AN")) {
                switch (choices[i]) {
                    case 1:
                        anPoint -= 3;
                        break;
                    case 2:
                        anPoint -= 2;
                        break;
                    case 3:
                        anPoint -= 1;
                        break;
                    case 4:
                        break;
                    case 5:
                        anPoint += 1;
                        break;
                    case 6:
                        anPoint += 2;
                        break;
                    case 7:
                        anPoint += 3;
                        break;

                }

            } else if (survey[i].equals("NA")) {
                switch (choices[i]) {
                    case 1:
                        anPoint += 3;
                        break;
                    case 2:
                        anPoint += 2;
                        break;
                    case 3:
                        anPoint += 1;
                        break;
                    case 4:
                        break;
                    case 5:
                        anPoint -= 1;
                        break;
                    case 6:
                        anPoint -= 2;
                        break;
                    case 7:
                        anPoint -= 3;
                        break;

                }

            }
        }

        if(rtPoint > 0){
            answer += "T";
        } else {
            answer += "R";
        }

        if(cfPoint > 0){
            answer += "F";
        } else {
            answer += "C";
        }

        if(jmPoint > 0){
            answer += "M";
        } else {
            answer += "J";
        }

        if(anPoint > 0){
            answer += "N";
        } else {
            answer += "A";
        }

        return answer;
    }
}