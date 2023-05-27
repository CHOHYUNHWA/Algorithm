import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] scores = new int[N];
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i<N-1; i++){
            for(int j = 0; j<N-i-1; j++){
                if(scores[j] < scores[j+1])
                    swap(scores,j,j+1);
            }
        }
        System.out.println(scores[x-1]);
    }
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}