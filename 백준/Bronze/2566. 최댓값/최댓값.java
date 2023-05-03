import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(Math.max(max,arr[i][j]) == arr[i][j]){
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(sb.append(max).append("\n").append(x).append(" ").append(y));
    }
}