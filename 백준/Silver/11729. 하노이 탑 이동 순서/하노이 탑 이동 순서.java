import java.io.*;


public class Main {
    static int count;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        hanoi(N,1,2,3);
        System.out.println(count);
        System.out.println(sb);

    }
    static void hanoi(int N, int start, int mid, int end){
        count++;
        if(N == 1){
            sb.append(start+" "+end).append('\n');
            return;
        }
        hanoi(N-1,start,end,mid);
        sb.append(start+ " " + end).append('\n');
        hanoi(N-1,mid,start,end);
    }
}