class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] knight = new int[number];

        for (int i = 0; i < number; i++) {
            knight[i] = i + 1;
        }

        int[] CD = new int[number];

        for(int i = 0; i < number; i++) {
            CD[i] = cdCountFind(knight[i], limit);
        }

        for(int i = 0; i < CD.length; i++) {
            if(CD[i] > limit){
                CD[i] = power;
            }
        }

        for(int i = 0; i < CD.length; i++) {
            answer += CD[i];
        }

        return answer;
    }

    public int cdCountFind(int num, int limit){
        int count = 0;
        int start = 1;
        while(start<=Math.sqrt(num)){
            if(num%start == 0){
                if(start == Math.sqrt(num)){
                    count++;
                } else {
                    count += 2;
                }
            }

            if(count > limit){
                return count;
            }

            start++;
        }

            return count;
    }
}