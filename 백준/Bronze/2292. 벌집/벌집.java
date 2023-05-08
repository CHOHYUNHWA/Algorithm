import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int range = 2;
        int count = 1;
        while (N >= range) {
            range = range + (count * 6);
            count++;
        }
        System.out.println(count);
    }
}