import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] list = {1,5,10,50};
    static int[] arr;
    static int answer;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        answer = 0;
        visited = new boolean[1001];
        
        dfs(N,0,0);
        System.out.println(answer);

    }


    private static void dfs(int N, int index, int sum) {
        if(N == 0){
            if(!visited[sum]){
                answer++;
                visited[sum] = true;
            }
            return ;
        }
        for(int i = index; i < 4; i++){
            dfs(N-1, i, sum+list[i]);
        }
    }
}