import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int min = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i< a; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i< a; i++){
            if(arr[i] < min){
                list.add(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<list.size(); i++){
            sb.append(list.get(i)).append(" ");
        }
        sb.deleteCharAt(sb.length() -1);
        System.out.println(sb);
    }
}