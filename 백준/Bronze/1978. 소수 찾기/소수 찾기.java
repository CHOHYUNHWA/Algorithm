import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            int count = 0;
            arr[i] = Integer.parseInt(st.nextToken());
            for(int j = 1; j<=arr[i]; j++){
                if(arr[i]%j == 0) {
                    count++;
                }
                }
                if(count == 2){
                    answer++;
            }
        }

        System.out.println(answer);
    }
}