import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int answer = getLCM(a,b);
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }
    static int getGCD(int num1, int num2){
        if(num1%num2 == 0){
            return num2;
        }
        return getGCD(num2,num1%num2);
    }

    static int getLCM(int num1, int num2){
        int gcd = getGCD(num1,num2);
        return num1*num2/gcd;
    }
}
