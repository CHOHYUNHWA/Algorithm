import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int[] chess = new int[]{1,1,2,2,2,8};
        for(int i =0; i < arr.length; i++) {
            sb.setLength(0);
            arr[i] = sc.nextInt();
            System.out.print(sb.append(chess[i]- arr[i]).append(" "));
        }
    }
}