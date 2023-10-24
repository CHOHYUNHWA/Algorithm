
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int count = 1;
        int length = 10;
        
        for(int i = 1; i <= N; i++){
            if(i == length){
                count++;
                length *= 10;
            }
            result += count;
        }
        
        System.out.println(result);
    }
}