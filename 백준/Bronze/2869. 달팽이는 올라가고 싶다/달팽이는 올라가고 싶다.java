import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int count = 0;
        int distance = 0;
        count = (C-B)/(A-B);
        if((C-B)%(A-B) != 0){
            count++;
        }
    System.out.println(count);
    }
}