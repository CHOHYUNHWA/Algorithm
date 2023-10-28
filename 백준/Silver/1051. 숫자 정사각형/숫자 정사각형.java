import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX = 1000000;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++){
            String[] numStr = br.readLine().split("");
            for(int j  = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(numStr[j]);
            }
        }
        int result = 1;
        int length = 1;
        for(int i = 1; i <= Math.max(N,M); i++){
            for(int j = 0; j< N-i; j++){
                for(int k = 0; k < M-i; k++){
                    if(arr[j][k] == arr[j+i][k] &&
                            arr[j][k] == arr[j][k+i] &&
                            arr[j][k] == arr[j+i][k] &&
                            arr[j][k] == arr[j+i][k+i]){
                        length = i + 1;
                        result = Math.max((int)length*(int)length,result);
//                    } else if(k+i < M && j+2*i < N && k-i >= 0){
//                        if(arr[j][k] == arr[j+i][k-i] &&
//                                arr[j][k] == arr[j+i][k+i] &&
//                                arr[j][k] == arr[j+2*i][k] &&
//                                arr[j][k] == arr[j+i][k+i]){
//                            result = (int) Math.max(result, Math.sqrt(Math.pow(Math.pow(i+1,2) + Math.pow(i+1,2),2)));
//                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}