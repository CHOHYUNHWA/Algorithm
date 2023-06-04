import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i < N; i++) {
            map.put(br.readLine(),1);
        }
        for(int i = 0; i < M; i++){
            if(map.get(br.readLine())!= null){
                count++;
            }
        }
        System.out.println(count);
    }
}