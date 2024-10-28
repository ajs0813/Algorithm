import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            if (ext.equals("code")) {
                if (data[i][0] < val_ext) {
                    list.add(data[i]);
                }

            } else if (ext.equals("date")) {
                if (data[i][1] < val_ext) {
                    list.add(data[i]);
                }

            } else if (ext.equals("maximum")) {
                if (data[i][2] < val_ext) {
                    list.add(data[i]);
                }

            } else if (ext.equals("remain")) {
                if (data[i][3] < val_ext) {
                    list.add(data[i]);
                }
            }
        }

        if (sort_by.equals("code")) {
            Collections.sort(list, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return Integer.compare(a[0], b[0]);
                }
            });

        } else if (sort_by.equals("date")) {
            Collections.sort(list, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return Integer.compare(a[1], b[1]);
                }
            });

        } else if (sort_by.equals("maximum")) {
            Collections.sort(list, new Comparator<int[]>(){
               @Override
               public int compare(int[]a, int[]b){
                   return Integer.compare(a[2], b[2]);
               }
            });
        } else if (sort_by.equals("remain")) {
            Collections.sort(list, new Comparator<int[]>(){
                @Override
                public int compare(int[]a, int[]b){
                    return Integer.compare(a[3], b[3]);
                }
            });
        }

        int[][] answer = new int[list.size()][list.get(0).length];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).clone();
        }

        return answer;
    }
}