import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int n = 0;
            if(st.hasMoreTokens()){
                n = Integer.parseInt(st.nextToken());
            }
            if(command.equals("add")){
                set.add(n);
                continue;
            } else if(command.equals("remove")){
                set.remove(n);
                continue;
            } else if(command.equals("check")){
                if(set.contains(n)){
                    sb.append(1).append('\n');
                    continue;
                } else {
                    sb.append(0).append('\n');
                    continue;
                }
            } else if(command.equals("toggle")){
                if(set.contains(n)){
                    set.remove(n);
                    continue;
                } else {
                    set.add(n);
                    continue;
                }
            } else if(command.equals("all")){
                for(int i = 1; i <= 20; i++){
                    set.add(i);
                }
                continue;
            } else if(command.equals("empty")){
                set.clear();
                continue;
            }
        }
        System.out.println(sb);
    }
}