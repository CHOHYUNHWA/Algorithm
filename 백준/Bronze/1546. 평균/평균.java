import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Double[] arr = new Double[a];
        double answer = 0;
        for(int i = 0 ; i < a ; i++){
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        double sum =0;
        double tmp = 0;
        for(int i = 0 ; i < a ; i++){
            tmp = arr[i]/arr[0]*100;
            sum = sum + tmp;
        }
        answer = sum/a;
        System.out.println(answer);
    }
}