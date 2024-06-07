import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt((Integer x) -> Math.abs(x)).thenComparingInt(x -> x));

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x != 0){
                pq.offer(x);
            } else {
                if(pq.isEmpty()){
                    bw.write("0\n");
                } else {
                    bw.write(pq.poll() + "\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

}
