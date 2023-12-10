import java.io.*;
import java.util.*;

public class Main {
    static int A,B,C,X,Y;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        int common;
        boolean check = false;
        if(X>=Y){
            common = Y;
            check = true;
        }else
            common = X;
        int answer = cal(common, check);
        System.out.println(answer);
    }
    static int cal(int common, boolean check){
        int result = 0;
        if(A+B >= C * 2)
            result += (C*2) * common;
        else
            result += (A+B) * common;

        if(!check){
            int size = Y - common;
            if(B <= C*2)
                result += B * size;
            else
                result += (C*2) * size;
        }else{
            int size = X - common;
            if(A <= C*2)
                result += A * size;
            else
                result += (C*2) * size;
        }
        return result;
    }
}