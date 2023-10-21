import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetE = Integer.parseInt(st.nextToken());
        int targetS = Integer.parseInt(st.nextToken());
        int targetM = Integer.parseInt(st.nextToken());
        int E = 0;
        int S = 0;
        int M = 0;
        int count = 0;
        while(true){
            if(targetE == E && targetS == S && targetM == M){
                System.out.println(count);
                break;
            }
            E++; S++; M++;
            count++;
            if(E > 15){
                E = 1;
            }
            if(S > 28){
                S = 1;
            }
            if(M > 19){
                M = 1;
            }
        }
    }
}