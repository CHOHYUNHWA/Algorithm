import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N  = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][M+1];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j  = 1; j < arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(arr[i][j-1],Math.max(arr[i-1][j], arr[i-1][j-1]));
                arr[i][j] += max;
            }
        }
        System.out.println(arr[N][M]);
    }
}