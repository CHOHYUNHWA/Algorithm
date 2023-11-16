import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long result = 0;
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for(int j = 0 ; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    result += gcd(arr[j],arr[k]);
                }
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }

    static int gcd(int a, int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
}