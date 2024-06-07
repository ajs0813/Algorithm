import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();

        int idx = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("?")) {
                idx = i;
            }
            arr.add(s);
        }

        String prefix = idx > 0 ? arr.get(idx - 1).substring(arr.get(idx - 1).length() - 1) : "";
        String suffix = idx < arr.size() - 1 ? arr.get(idx + 1).substring(0, 1) : "";

        int M = Integer.parseInt(br.readLine());
        String answer = "";
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (!arr.contains(s) && (prefix.isEmpty() || prefix.equals(s.substring(0, 1))) && (suffix.isEmpty() || suffix.equals(s.substring(s.length() - 1)))) {
                {
                    answer = s;
                }
            }
        }
        System.out.println(answer);
    }
}