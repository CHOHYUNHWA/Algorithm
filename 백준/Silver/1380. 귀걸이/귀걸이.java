import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(true){

            int n = Integer.parseInt(br.readLine());
            if(n==0){
                break;
            }
            String[] nameArr = new String[n+1];
            int[] arr = new int[n+1];
            for(int i =1; i<=n; i++){
                nameArr[i] = br.readLine();
            }

            for(int j = 0; j < 2*n-1; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())]++;
            }


            for(int i = 1; i < nameArr.length; i++){
                if(arr[i] % 2 != 0 ){
                    sb.append(++count).append(" ").append(nameArr[i]).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}