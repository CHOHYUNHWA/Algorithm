import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int answer = 3;
        for(int i = 0; i< N-1; i++) {
            answer += answer -1;
        }
        System.out.println((int)Math.pow(answer,2));
    }
}