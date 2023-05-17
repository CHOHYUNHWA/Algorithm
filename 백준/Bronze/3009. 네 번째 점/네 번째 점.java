import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr[0] == arr[2]) {
            sb.append(arr[4]).append(" ");
        } else if (arr[2] == arr[4]) {
            sb.append(arr[0]).append(" ");
        } else {
            sb.append(arr[2]).append(" ");
        }
        if (arr[1] == arr[3]){
            sb.append(arr[5]).append(" ");
        } else if(arr[3] == arr[5]){
            sb.append(arr[1]).append(" ");
        } else {
            sb.append(arr[3]).append(" ");
        }
        System.out.println(sb);
    }
}