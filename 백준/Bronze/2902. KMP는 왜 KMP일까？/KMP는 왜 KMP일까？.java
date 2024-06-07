import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] text = br.readLine().split("-");
        for(int i =0; i<text.length; i++){
            System.out.print(text[i].toCharArray()[0]);
        }


    }
}
