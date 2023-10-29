import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX = 1000000;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int result = A.length();
        for(int i = 0; i <= B.length()-A.length(); i++){
            int count = A.length();
            String tmp = B.substring(i,B.length());
            for(int j = 0; j < A.length(); j++){
                if(tmp.charAt(j) == A.charAt(j)){
                    count--;
                }
            }
            result = Math.min(result, count);
        }
        System.out.println(result);
    }
}