import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            if(s1.equals("ChongChong") || s2.equals("ChongChong")){
                set.add(s1);
                set.add(s2);
            }
            if(set.contains(s1) || set.contains(s2)){
            set.add(s1);
            set.add(s2);
            }
        }

        System.out.println(set.size());
    }
}