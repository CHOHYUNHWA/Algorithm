import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strN = br.readLine();
        int N = Integer.parseInt(strN);
        int maxSum = strN.length()*9;
        int answer = 0;
        int tmpInt = 0;
        for(int i = 1; i<=N; i++){
            String tmp = String.valueOf(i);
            String[] tmpArr = tmp.split("");
            int sum =0;
            for(int j = 0; j< tmpArr.length; j++){
                sum += Integer.parseInt(tmpArr[j]);
            }
            if(i+sum == N){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}