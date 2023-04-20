import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int answer = 0;
        for(int i = 0 ; i < a ; i++){
            arr[i] = sc.nextInt();
        }
        int tmp = sc.nextInt();
        for(int i = 0 ; i < a ; i++){
            if(arr[i] == tmp){
                answer ++;
            }
        }
        System.out.println(answer);
    }
}