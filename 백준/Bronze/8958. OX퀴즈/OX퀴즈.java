import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++){
            String s = br.readLine();
            int count = 0;
            int answer = 0;
            for(int j = 0; j< s.length(); j++){
                if(s.charAt(j) == 'O'){
                    count++;
                    answer += count;
                } else {
                    count = 0;
                }
            }
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }
}