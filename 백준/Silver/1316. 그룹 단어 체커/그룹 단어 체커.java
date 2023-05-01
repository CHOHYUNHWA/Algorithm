import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        for(int i = 0 ; i < N ; i++) {
            String s = sc.next();
            boolean[] check = new boolean[26];
            boolean tmp = true;
            for(int j = 0; j<s.length(); j++) {
                int idx = s.charAt(j) - 'a';
                if(check[idx]){
                    if(s.charAt(j) != s.charAt(j-1)){
                        tmp = false;
                        break;
                    }
                } else {
                    check[idx] = true;
                }
            }
            if(tmp)
                answer++;
        }
        System.out.println(answer);
    }
}