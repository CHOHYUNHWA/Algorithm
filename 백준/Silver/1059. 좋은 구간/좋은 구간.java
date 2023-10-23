import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(bf.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for(int i = 0; i < l; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int n = Integer.parseInt(bf.readLine());
        int start = 0, end = 1001;
        for(int i : list) { 
            if(i < n) {
                if( i > start) {
                    start = i;
                }
            }else if(i > n) {
                if(i < end) {
                    end = i;
                }
            }else {	
                System.out.println(0);
                return;
            }
        }
        int cnt = 0;
        for(int i = start + 1; i <= n; i++) {
            for(int j = n; j <= end - 1; j++) {
                if(i != j) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}