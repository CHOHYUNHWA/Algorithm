import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][][] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < arr.length-2; i++){
            for(int j = i+1; j < arr.length-1; j++){
                for(int k = j+1; k <arr.length; k++){
                    int agcd = GCD(arr[i], arr[j]);
                    int alcm = LCM(arr[i],arr[j]);
                    int lcm = LCM(LCM(arr[i],arr[j]),arr[k]);
                    if(min > lcm){
                        min = lcm;
                    }
                }
            }
        }
        System.out.println(min);
    }
    static int LCM(int a, int b){
        return a*b/GCD(a,b);
    }

    static int GCD(int a, int b){
        if(a%b == 0){
            return b;
        }
        return GCD(b, a%b);
    }
}