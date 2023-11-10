import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if(N == 1 || (N == 2 && arr[0] != arr[1]) ){
            System.out.println("A");
            return;
        } else if(N == 2){
            System.out.println(arr[0]);
            return;
        }

        int a = 0;
        int b = 0;
        if(arr[0] == arr[1]){
            a=1;
            b=0;
        } else {
            a = (arr[2] - arr[1]) / (arr[1] - arr[0]);
            b = arr[1]-(arr[0] * a);
        }

        if(!check(a,b)){
            System.out.println("B");
        } else {
            System.out.println(arr[N-1]*a+b);
        }

    }

    private static boolean check(int a, int b) {
        for(int i = 0; i < N-1; i++){
            if(arr[i+1] != arr[i]*a+b){
                return false;
            }
        }
        return true;
    }
}