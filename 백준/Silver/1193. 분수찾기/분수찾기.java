import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int top = 0;
        int bottom = 0;
        int line = 0;
        int tmp = 0;
        while (tmp < N){
            tmp = line*(line+1)/2;
            line++;
        }
        line = line -1;
        if(line%2 != 0){
            top = 1+tmp-N;
            bottom = line + N - tmp;
        }else{
            top = line + N - tmp;
            bottom = 1+tmp-N;

        }

        System.out.println(top+"/"+bottom);
    }
}