import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int result = -1;
            int count = 1;
            int gcd = getGCD(M, N);
            int lcm = getLCM(M, N, gcd);
            int year = x;
            int resultY;
            while(true){
                if(year > lcm){
                    sb.append(-1).append('\n');
                    break;
                } else {
                    if (year % N == 0) {
                        if (N == y) {
                            sb.append(year).append('\n');
                            break;
                        }
                    } else {
                        if (year % N == y) {
                            sb.append(year).append('\n');
                            break;
                        }
                    }
                }
                year+=M;
            }
        }
        System.out.println(sb);
    }

    static int getGCD(int M, int N){
        if(M % N == 0){
            return N;
        }
        return getGCD(N,M%N);
    }
    static int getLCM(int M, int N, int gcd){
        return M*N/gcd;
    }
}