import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int tmp = 0;
            sb.setLength(0);
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a==-1){
                break;
            }
            sb.append(a+" = ");
            for(int i = 1; i<=a/2; i++){
                if(a%i == 0){
                    sb.append(i+" + ");
                    tmp += i;
                }
            }
            sb.setLength(sb.length()-3);
            if(tmp == a){
                System.out.println(sb);
            } else{
                System.out.println(a+" is NOT perfect.");
            }
        }
        br.close();
    }
}