import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX = 1000000;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = new boolean[MAX+1];
        for(int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }
        for(int i = 2; i <= MAX; i++) {
            for(int j = i * 2; j <= MAX; j += i) {
                if(!isPrime[j]) continue;
                isPrime[j] = false;
            }
        }



        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            boolean flag = false;
            for(int i = 2; i <= n/2; i++){
                if(isPrime[i] && isPrime[n-i]){
                    sb.append(n + " = "+ i + " + " + (n-i)).append('\n');
                    flag = true;
                    break;
                }
            }
            if(!flag){
                sb.append("Goldbach's conjecture is wrong.").append('\n');
            }
        }
        System.out.println(sb);
    }
}