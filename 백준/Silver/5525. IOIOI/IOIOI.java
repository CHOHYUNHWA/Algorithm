import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String[] S = br.readLine().split("");
        String[] P = new String[3];
        int count = 0;
        int result = 0;
        P[0] = "I";
        P[1] = "O";
        P[2] = "I";


        for(int i = 0; i < S.length-2; i++){
            if(S[i].equals(P[0]) && S[i+1].equals(P[1]) && S[i+2].equals(P[2])){
                count++;
                if(count == N){
                    count--;
                    result++;
                }
                i++;
            } else {
                count = 0;
            }
        }
        System.out.println(result);

    }
}