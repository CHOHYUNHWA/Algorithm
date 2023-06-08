import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a = br.readLine();
        Set<String> set = new HashSet();
        for(int i = 0; i <= a.length(); i++){
            for(int j = i+1; j <= a.length(); j++){
                set.add(a.substring(i,j));
            }
        }
        System.out.println(set.size());
    }
}