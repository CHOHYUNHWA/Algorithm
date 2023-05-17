import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int[] arr = new int[3];
           for(int i = 0; i< arr.length; i++){
               arr[i] = Integer.parseInt(st.nextToken());
           }
           if(arr[0] == 0){
               break;
           }
           Arrays.sort(arr);
           if(arr[0] + arr[1] > arr[2]) {
               if (arr[0] == arr[1] && arr[1] == arr[2]) {
                   System.out.println("Equilateral");
               } else if((arr[0] != arr[1] && arr[1] == arr[2]) || (arr[0] == arr[1] && arr[1] != arr[2])){
                   System.out.println("Isosceles");
               } else {
                   System.out.println("Scalene");
               }
           } else {
               System.out.println("Invalid");
           }
        }
    }
}