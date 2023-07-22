import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        while(N-- > 0){
            String s = br.readLine();
            String[] sArr = s.split(" ");
            int tmp = 0;
            if(sArr.length > 1) {
                tmp = Integer.parseInt(sArr[1]);
            }
            if(s.contains("add")){
                set.add(tmp);
                continue;
            } else if(s.contains("remove")){
                set.remove(tmp);
                continue;
            } else if(s.contains("check")){
                if(set.contains(tmp)){
                    sb.append(1).append('\n');
                    continue;
                } else {
                    sb.append(0).append('\n');
                    continue;
                }
            } else if(s.contains("toggle")){
                if(set.contains(tmp)){
                    set.remove(tmp);
                    continue;
                } else {
                    set.add(tmp);
                    continue;
                }

            } else if(s.contains("all")){
                for(int i = 0; i <= 20; i++){
                    set.add(i);
                }
                continue;
            } else if(s.contains("empty")){
                set.clear();
                continue;
            }
        }
        System.out.println(sb);
    }
}