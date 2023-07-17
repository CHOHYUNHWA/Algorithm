import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] bodySize = new int[N][2];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            bodySize[i][0] = Integer.parseInt(st.nextToken());
            bodySize[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N ; i++) {
            int rate = 1;
            for (int j = 0; j < N; j++) {
                if (bodySize[i][0] < bodySize[j][0] && bodySize[i][1] < bodySize[j][1]) {
                    rate++;
                }
            }
            sb.append(rate).append('\n');
        }
        System.out.println(sb);
    }
}