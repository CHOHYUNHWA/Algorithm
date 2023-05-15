import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int[] arr = new int[N + M + 1];
        for (int i = N; i <= M; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 2){
                min = Math.min(min,i);
                sum += i;
            }
        }
        if(sum != 0){
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}