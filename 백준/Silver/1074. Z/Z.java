import java.io.*;
import java.util.*;

public class Main {
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2,N);

        solve(size,r,c);
        System.out.println(result);
    }
    private static void solve(int size, int r, int c) {
        if(size == 1){
            return;
        }
        int halfSize = size/2;
        if(r < halfSize && c < halfSize){
            result += halfSize * halfSize * 0;
            solve(halfSize, r, c);
        } else if(r < halfSize && c < halfSize + halfSize ){
            result+= halfSize * halfSize * 1;
            solve(halfSize, r,c - halfSize) ;
        } else if(r < halfSize + halfSize && c< halfSize){
            result+= halfSize * halfSize * 2;
            solve(halfSize, r- halfSize, c);
        } else if(r < halfSize + halfSize && c < halfSize + halfSize){
            result+= halfSize * halfSize * 3;
            solve(halfSize, r-halfSize, c -halfSize);
        }
    }
}