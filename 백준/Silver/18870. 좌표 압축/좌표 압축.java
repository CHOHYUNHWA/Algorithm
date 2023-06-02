import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] originArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            originArr[i] = Integer.parseInt(st.nextToken());
        }
        int[] distinctArr = Arrays.stream(originArr).distinct().sorted().toArray();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < distinctArr.length; i++){
            map.put(distinctArr[i], i);
        }
        for(int i = 0; i< originArr.length; i++){
                    sb.append(map.get(originArr[i])).append(" ");
        }
        System.out.println(sb);
    }
}