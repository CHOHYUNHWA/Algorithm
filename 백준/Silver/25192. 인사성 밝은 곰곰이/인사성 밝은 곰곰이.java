import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            if(!s.equals("ENTER")){
                set.add(s);
            }
            if (s.equals("ENTER") || i == N-1) {
                count += set.size();
                set.clear();
            }
        }
        System.out.println(count);
    }
}