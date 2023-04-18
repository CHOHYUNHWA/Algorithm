import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int count = Integer.parseInt(s);
        for (int i = 0; i < count; i++) {
            String a = br.readLine();
            String[] aArr = a.split(" ");
            int answer = 0;
            for (int j = 0; j < aArr.length; j++) {
                answer += Integer.parseInt(aArr[j]);
            }
            bw.write(answer + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}