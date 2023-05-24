import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int tmp = N;
        int count = 1;
        int answer = 0;
        if(N%5 == 0){
            answer = N/5;
        }
        if(N%5 != 0 && N%3 == 0){
            answer = N/3;
        }
        while(5*count <= N){
            tmp = tmp - 5*count;
            if(tmp%3 == 0) {
                if (answer == 0 || answer > count+tmp/3) {
                    answer = count + tmp / 3;
                }
            }
            count ++;
            tmp = N;
        }
        if(answer != 0){
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}