import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            if(N%H == 0){
                sb.append(H);
            } else {
                sb.append(String.valueOf(N % H));
            }
            if((int)Math.ceil((double)N / (double)H) >= 10){
               sb.append(String.valueOf((int)Math.ceil((double)N / (double)H))) ;
            } else {
                sb.append("0").append(String.valueOf((int)Math.ceil((double)N / (double)H))) ;
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}