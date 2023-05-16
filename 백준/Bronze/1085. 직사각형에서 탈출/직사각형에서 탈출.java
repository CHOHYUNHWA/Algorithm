import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i< 4; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.add(Math.min(list.get(2)-list.get(0),list.get(3)-list.get(1)));


        System.out.println(Collections.min(list));
    }
}