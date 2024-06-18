class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] arrBinary1 = new String[arr1.length];
        String[] arrBinary2 = new String[arr2.length];

        char[][] board1 = new char[16][16];
        char[][] board2 = new char[16][16];

        for (int i = 0; i < n; i++) {
            arrBinary1[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            arrBinary1[i] = arrBinary1[i].substring(arrBinary1[i].length() - n);
            arrBinary2[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr2[i])));
            arrBinary2[i] = arrBinary2[i].substring(arrBinary2[i].length() - n);
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board1[i][j] = arrBinary1[i].charAt(j);
                board2[i][j] = arrBinary2[i].charAt(j);
            }
        }

        String check = "";

        for (int i = 0; i < n; i++) {
            check = "";
            for (int j = 0; j < n; j++) {
                if(board1[i][j] == '0' && board2[i][j] == '0'){
                    check += " ";
                }
                if (board1[i][j] == '1' || board2[i][j] == '1'){
                    check += "#";
                }

                answer[i] = check;

            }
        }

        return answer;
    }
}
