import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] APT = new int[15][15];
        for(int i = 0 ; i < APT.length; i ++){
                APT[i][1] = 1;
                APT[0][i] = i;
        }
        for(int i = 1; i < APT.length; i++ ){
            for(int j = 2; j < APT.length; j++){
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
        for(int i = 0; i < T; i++){
            sb.append(APT[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())]).append('\n');
        }
        System.out.println(sb);
    }
}