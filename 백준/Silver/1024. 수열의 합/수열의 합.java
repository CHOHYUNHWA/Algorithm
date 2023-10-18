import java.io.*;
import java.util.*;


public class Main {
    static int[] tmpArr;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        while (true) {
            int min = N/L - ((L-1)/2);
            if(min < 0 || L > 100){
                System.out.println(-1);
                break;
            }
            int sum = (min*2+L-1)* L / 2;
            if(sum == N) {
                for (int i = 0; i < L; i++) {
                    sb.append(min + i).append(" ");
                }
                System.out.println(sb);
                break;
            }
            L++;
        }
    }
}