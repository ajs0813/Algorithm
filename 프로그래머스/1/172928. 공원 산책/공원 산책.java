class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[] position = new int[2];
        String[][] board = new String[park.length][park[0].length()];

        outerLoop:
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    position[0] = i;
                    position[1] = j;
                    break outerLoop;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Character.toString(park[i].charAt(j));
            }

        }

        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            int[] startPosition = position.clone();

            if (route[0].equals("N")) {
                for (int j = 0; j < Integer.parseInt(route[1]); j++) {
                    if (startPosition[0] - Integer.parseInt(route[1]) >= 0) {
                        position[0]--;
                        if (board[position[0]][position[1]].equals("X")) {
                            position = startPosition.clone();
                            break;
                        }
                    }
                }
            }

            if (route[0].equals("S")) {
                for (int j = 0; j < Integer.parseInt(route[1]); j++) {
                    if (startPosition[0] + Integer.parseInt(route[1]) < board.length) {
                        position[0]++;
                        if (board[position[0]][position[1]].equals("X")) {
                            position = startPosition.clone();
                            break;
                        }
                    }
                }
            }

            if (route[0].equals("W")) {
                for (int j = 0; j < Integer.parseInt(route[1]); j++) {
                    if (startPosition[1] - Integer.parseInt(route[1]) >= 0) {
                        position[1]--;
                        if (board[position[0]][position[1]].equals("X")) {
                            position = startPosition.clone();
                            break;
                        }
                    }
                }
            }

            if (route[0].equals("E")) {
                for (int j = 0; j < Integer.parseInt(route[1]); j++) {
                    if (startPosition[1] + Integer.parseInt(route[1]) < board[0].length) {
                        position[1]++;
                        if (board[position[0]][position[1]].equals("X")) {
                            position = startPosition.clone();
                            break;
                        }
                    }
                }
            }
        }

        answer = position.clone();

        return answer;
    }
}