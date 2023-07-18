import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        long sum = 0;
        for(int i = 0; i < N; i++){
            int tmp = br.read();
            sum += (tmp - 96) * (Math.pow(31, i));
        }
        System.out.println(sum);
    }
}