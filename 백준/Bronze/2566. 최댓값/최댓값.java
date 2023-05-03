import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = -1;
        int x = 0;
        int y = 0;
        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<9; j++){
                int n = Integer.parseInt(st.nextToken());
                if(max < n){
                    max = n;
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(sb.append(max).append("\n").append(x).append(" ").append(y));
    }
}