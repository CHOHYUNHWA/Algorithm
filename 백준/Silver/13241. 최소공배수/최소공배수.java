import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Integer.parseInt(st.nextToken());
            long b = Integer.parseInt(st.nextToken());
            long answer = getLCM(a,b);
            sb.append(answer);
        System.out.println(sb);
    }
    static long getGCD(long num1, long num2){
        if(num1%num2 == 0){
            return num2;
        }
        return getGCD(num2,num1%num2);
    }

    static long getLCM(long num1, long num2){
        long gcd = getGCD(num1,num2);
        return num1*num2/gcd;
    }
}