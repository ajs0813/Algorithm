class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        // 큰 사각형의 넓이
        // = 갈색 격자의 개수 + 노란색 격자의 개수
        // = 카펫의 너비 x 카펫의 높이

        // 노란색 격자 넓이의 규칙이 다음과 같음을 알 수 있음
        // (카펫의 너비-2) x (카펫의 높이-2) -> 이는 노란색 격자의 수와 같음
        // 이 부분을 눈치채야만 풀 수 있는 문제인 듯?

        int area = brown + yellow;

        // 카펫 가로 세로의 길이는 area 값의 약수
        // ex 12 -> (1, 12), (2, 6), (3, 4)...
        // 하지만 가로 길이가 세로보다 길다고 했으므로 (12, 1), (6, 2), (4, 3)이 남음
        // 또한 가로 세로의 길이가 최소 3이상 되어야 내부에 노란색 타일이 존재 가능



        for (int i = 3; i < area; i++) {
            if (area % i == 0) { // 만약 (카펫 넓이 / 가로 길이)가 0 이면 이는 가로 길이가 area의 약수라는
                int weight = i;
                int height = area / i;
                if (weight >= height) { // 가로가 세로보다 길다면
                    if ((weight - 2) * (height - 2) == yellow) { // (카펫의 너비-2) x (카펫의 높이-2) -> 이는 노란색 격자의 수와 같음
                        answer[0] = weight;
                        answer[1] = height;

                    }
                }

            }
        }


        return answer;
    }
}