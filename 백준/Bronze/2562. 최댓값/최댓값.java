import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i< 9; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        for(int i = 0; i< 9; i++){
            if(max == arr[i]){
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
