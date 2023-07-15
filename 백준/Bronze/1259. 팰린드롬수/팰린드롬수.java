import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String N = br.readLine();
            if(N.equals("0")){
                break;
            }
            boolean flag = true;
            int j = N.length()-1;
            for(int i = 0; i < N.length()/2; i++){
                if(N.charAt(i) != N.charAt(j)){
                    sb.append("no").append('\n');
                    flag = false;
                    break;
                }
                j--;
            }
            if(flag == true) {
                sb.append("yes").append('\n');
            }
        }
        System.out.println(sb);
    }
}