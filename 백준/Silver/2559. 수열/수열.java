import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int current = 0;
        for(int i  = 0; i < K; i++){
            current += arr[i];
        }
        max = current;
        for(int i = K ; i < N; i++){
            current = current - arr[i-K] + arr[i];
            if(max < current){
                max = current;
            }
        }
        System.out.println(max);
    }
}