class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        // 가능한 모든 점 조합의 기울기를 비교

        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;

        return answer;
    }

    private boolean isParallel(int[] p1, int[] p2, int[] p3, int[] p4) {
        // (y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1)
        return (p2[1] - p1[1]) * (p4[0] - p3[0]) == (p4[1] - p3[1]) * (p2[0] - p1[0]);
    }
}