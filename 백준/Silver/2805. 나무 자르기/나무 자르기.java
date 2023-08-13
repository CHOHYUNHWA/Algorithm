import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        int[] trees = new int[N];
        for(int i = 0 ; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            trees[i] = tmp;
            if(tmp > max){
                max = tmp;
            }
        }
        int min = 0;
        int mid = 0;
        while(min < max) {
            mid = (max + min) / 2;
            long sum = 0;
            for (int tree : trees) {
                if (tree - mid > 0) {
                    sum += tree - mid;
                }
            }
            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min-1);
    }
}