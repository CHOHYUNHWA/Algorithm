import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int tmp = 1;

        for(int i = 1; i <= N; i++){
            if(i > 9 && i < 100){
                tmp = 2;
            } else if(i > 99 && i < 1_000){
                tmp = 3;
            } else if(i > 999 && i < 10_000){
                tmp = 4;
            } else if(i > 9_999 && i < 100_000){
                tmp = 5;
            } else if(i > 99_999 && i < 1_000_000){
                tmp = 6;
            } else if(i > 999_999 && i < 10_000_000){
                tmp = 7;
            } else if(i > 9_999_999 && i < 100_000_000){
                tmp = 8;
            } else if(i > 99_999_999){
                tmp = 9;
            }

            result += tmp;
        }
        System.out.println(result);
    }
}