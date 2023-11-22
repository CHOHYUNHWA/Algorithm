import java.io.*;
import java.util.*;

public class Main {
    static int N,L,R,X, result;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] arr = new int[26];
        for(int i = 0 ; i < str.length(); i++){
            arr[str.charAt(i) - 97]++;
        }
        for(int i = 0 ; i < arr.length; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}