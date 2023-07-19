import java.io.*;
import java.util.*;

public class Main {
    static int N, M, B;
    static int time = Integer.MAX_VALUE;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        int floor = 0;
        while (max >= min) {
            int tmp = 0;
            int block = B;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] > max){
                        block += (arr[i][j] - max);
                        tmp += (arr[i][j] - max) * 2;
                    } else if(arr[i][j] < max){
                        block -= max - arr[i][j];
                        tmp += max - arr[i][j];
                    }
                }
            }
            if(block >= 0 && time > tmp){
                time = tmp;
                floor = max;
            }
            max--;
        }
        System.out.println(time + " " + floor);
    }
}