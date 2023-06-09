import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int top1 = Integer.parseInt(st.nextToken());
        int bottom1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int top2 = Integer.parseInt(st.nextToken());
        int bottom2 = Integer.parseInt(st.nextToken());
        int answerTop = top1 * bottom2+ top2 * bottom1;
        int answerBottom = bottom1 * bottom2;
        int gcd = getGCD(answerTop, answerBottom);
        sb.append(answerTop/gcd).append(" ").append(answerBottom/gcd);
        System.out.println(sb);
    }
    static int getGCD(int num1 , int num2){
        if(num1%num2==0){
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}