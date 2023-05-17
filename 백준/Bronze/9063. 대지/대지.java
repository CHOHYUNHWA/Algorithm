import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] xArr = new int[N];
        int[] yArr = new int[N];
        for(int i = 0; i< N; i++){
            st = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        int horizontal = xArr[xArr.length-1] - xArr[0];
        int vertical = yArr[yArr.length-1] - yArr[0];
        if(N == 1){
            System.out.println(0);
        } else {
            System.out.println(horizontal * vertical);
        }
    }
}