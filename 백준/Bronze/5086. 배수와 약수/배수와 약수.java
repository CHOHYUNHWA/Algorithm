import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        while(on){
            sb.setLength(0);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a-b < 0 && b%a == 0){
                sb.append("factor");
                System.out.println(sb);
            }else if(a-b > 0 && a%b == 0){
                sb.append("multiple");
                System.out.println(sb);
            } else if((a-b >0 &&a%b!= 0) || (b-a>0 && b%a !=0)){
                sb.append("neither");
                System.out.println(sb);
            }
            if(a == 0 && b == 0){
                on = false;
            }
        }
    }
}