import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Text = br.readLine();

        for(int i=0; i<Text.length(); i+=10){
            String temp;
            if(i+10<Text.length()){
                temp = Text.substring(i, i+10);
            } else {
                temp = Text.substring(i, Text.length());
            }

            System.out.println(temp);
        }



    }
}
