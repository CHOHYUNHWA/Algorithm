import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[2*N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j< M; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i< N; i++){
            for(int j = 0; j< M; j++){
                arr[i][j] += sc.nextInt();
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}