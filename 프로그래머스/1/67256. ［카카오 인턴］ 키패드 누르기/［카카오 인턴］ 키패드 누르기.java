class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] phone = {{99, 7, 4, 1}, {0, 8, 5, 2}, {88, 9, 6, 3}};
        int[] leftHand = {0, 0};
        int[] rightHand = {2, 0};
        int min = Integer.MAX_VALUE;
        int leftDistance = 0;
        int rightDistance = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < phone.length; j++) {
                for (int k = 0; k < phone[j].length; k++) {
                    if (phone[j][k] == numbers[i]) {
                        if (j == 1) { // 누르려는 숫자가 2 5 8 0 일 때
                            leftDistance = Math.abs(leftHand[0] - j) + Math.abs(leftHand[1] - k);
                            rightDistance = Math.abs(rightHand[0] - j) + Math.abs(rightHand[1] - k);
                            min = Math.min(leftDistance, rightDistance);
                            if (min == leftDistance && leftDistance != rightDistance) {
                                answer += "L";
                                leftHand[0] = j;
                                leftHand[1] = k;
                                break;
                            } else if (min == rightDistance && rightDistance != leftDistance) {
                                answer += "R";
                                rightHand[0] = j;
                                rightHand[1] = k;
                                break;
                            } else if(leftDistance == rightDistance){
                                if(hand.equals("left")){
                                    answer += "L";
                                    leftHand[0] = j;
                                    leftHand[1] = k;
                                    break;
                                } else if(hand.equals("right")){
                                    answer += "R";
                                    rightHand[0] = j;
                                    rightHand[1] = k;
                                    break;
                                }
                            }
                        } else if (j == 0) { // 누르려는 숫자가 1 4 7 일 때
                            answer += "L";
                            leftHand[0] = j;
                            leftHand[1] = k;
                            break;
                        } else if (j == 2) { // 누르려는 숫자가 3 6 9 일 때
                            answer += "R";
                            rightHand[0] = j;
                            rightHand[1] = k;
                            break;
                        }
                    }
                }
            }
        }

        return answer;
    }
}