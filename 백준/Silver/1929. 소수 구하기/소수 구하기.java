import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for(int i = M; i <= N; i++){
            if(i<2){
                continue;
            }
            if(isPrime(i)){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
    static boolean isPrime(int a){
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}