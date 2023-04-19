import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(a+b).append("\n");
            if(a == 0 && b == 0) {
                break;
            }
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
