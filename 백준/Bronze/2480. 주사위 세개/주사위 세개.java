import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        if(arr[0]== arr[1] && arr[1]==arr[2]){
            System.out.println(10000+arr[1]*1000);
        }
        if(arr[0]== arr[1] && arr[1]!=arr[2]){
            System.out.println(1000+arr[1]*100);
        }
        if(arr[0]!= arr[1] && arr[1]==arr[2]){
            System.out.println(1000+arr[1]*100);
        }
        if(arr[0]!= arr[1] && arr[1]!=arr[2]){
            System.out.println(arr[2]*100);
        }
    }
}