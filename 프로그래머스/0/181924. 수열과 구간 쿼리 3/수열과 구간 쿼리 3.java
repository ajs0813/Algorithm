class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int firstIndex = 0;
        int secondIndex = 0;
        int set1 = 0;
        int set2 = 0;
        for(int i = 0; i<queries.length; i++){
            firstIndex = queries[i][0];
            secondIndex = queries[i][1];
            
            set1 = arr[firstIndex]; // 0
            set2 = arr[secondIndex]; // 3
            
            arr[firstIndex] = set2; // 3
            arr[secondIndex] = set1; // 0
            
        }
        
        answer = arr;
        
        return answer;
    }
}