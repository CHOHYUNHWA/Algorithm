import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] distance = new int[N-1];
        int[] city = new int[N];
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < distance.length; i++){
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < city.length; i++){
            city[i] = Integer.parseInt(st.nextToken());
        }
        int tmp = Integer.MAX_VALUE;
        for(int i = 0 ; i < distance.length; i++){
            if(tmp > city[i]){
                tmp = city[i];
            }
            answer+= distance[i] * tmp;
        }
        System.out.println(answer);
    }
}