import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j< M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i< N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j< M; j++){
                arr[i][j] += Integer.parseInt(st.nextToken());
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}