import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static int[] lis;
    static int[] lds;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        lis = new int[N];
        lds = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        LIS();
        LDS();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            max = Math.max(max, lis[i] + lds[i]);
        }
        System.out.println(max-1);
    }

    private static void LIS() {
        for(int i = 0 ; i < N; i++){
            lis[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j] && lis[i] < lis[j]+1){
                    lis[i] = lis[j] + 1;
                }
            }
        }
    }

    private static void LDS() {
        for(int i = N-1 ; i >= 0; i--){
            lds[i] = 1;
            for(int j = N -1 ; j > i; j--){
                if(arr[i] > arr[j] && lds[i] < lds[j] +1 ){
                    lds[i] = lds[j] + 1;
                }
            }
        }
    }
}