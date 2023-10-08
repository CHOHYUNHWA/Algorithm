import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N+1];
        int dp[] = new int[N+1];
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                    result = Math.max(dp[i], result);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(result).append('\n');
        Stack<Integer> stack = new Stack();
        for(int i = dp.length-1; i > 0; i--){
            if(dp[i] == result){
                stack.push(arr[i]);
                result--;
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb);
    }
}