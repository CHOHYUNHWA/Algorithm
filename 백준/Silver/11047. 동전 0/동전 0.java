import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] pocket = new int[N];

        for(int i = pocket.length-1; i >= 0; i--){
            pocket[i] = Integer.parseInt(br.readLine());
        }

        int i = 0;
        int answer = 0;
        while(K != 0){
            answer += K/pocket[i];
            K = K%pocket[i];
            i++;
        }
        System.out.println(answer);
    }
}