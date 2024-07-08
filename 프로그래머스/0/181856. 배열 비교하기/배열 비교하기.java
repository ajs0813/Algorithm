class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int check1 = 0;
        int check2 = 0;
        if(arr1.length>arr2.length){
            answer = 1;
        } else if (arr1.length<arr2.length){
            answer = -1;
        } else {
            for(int i = 0; i<arr1.length; i++){
                check1 += arr1[i];
                check2 += arr2[i];
            }
            
            answer = check1>check2 ? 1 : check1<check2 ? -1 : 0;
        }
        return answer;
    }
}