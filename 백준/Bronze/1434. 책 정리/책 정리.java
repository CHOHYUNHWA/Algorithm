import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        String[] box = br.readLine().split(" ");
        String[] book = br.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int sum_box = 0;
        int sum_book = 0;

        for(int i = 0; i < N; i++) {
            sum_box += Integer.parseInt(box[i]);
        }

        for(int i = 0; i < M; i++) {
            sum_book += Integer.parseInt(book[i]);
        }

        int result = sum_box - sum_book;

        System.out.println(result);
    }
}