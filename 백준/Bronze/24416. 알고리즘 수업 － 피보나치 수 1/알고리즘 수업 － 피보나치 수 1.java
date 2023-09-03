import java.io.*;
import java.util.*;

public class Main {
    static int codeOne = 0;
    static int codeTwo = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        fibonacci(N);
        System.out.println(codeOne+" "+(N-2));
    }

    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            codeOne++;
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n -2);
    }
}