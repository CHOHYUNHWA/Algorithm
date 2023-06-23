import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 1;
        for(int i = 0; i< N; i++) {
            int element = Integer.parseInt(br.readLine());
            for (int j = 0; j <= element; j++) {
                    if (list.size() !=0 && element == list.get(list.size()-1)) {
                    list.remove(list.size()-1);
                    sb.append("-").append('\n');
                    break;
                } else if(list.size() == 0 || list.get(list.size()-1) <= element) {
                        list.add(count++);
                        sb.append("+").append('\n');
                    } else {
                        break;
                    }
            }
        }
        if(list.size() != 0){
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}