import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i< N; i++){

            String s = br.readLine();


            if(s.contains("push")){
                int pushN = Integer.parseInt(s.substring(5));
                list.add(pushN);
            }

            if(s.equals("pop")){
                if(list.size() == 0){
                    sb.append(-1).append('\n');
                } else{
                    sb.append(list.get(list.size()-1)).append('\n');
                    list.remove(list.size()-1);
                }
            }

            if(s.equals("size")){
                sb.append(list.size()).append('\n');
            }

            if(s.equals("empty")){
                if(list.size() == 0){
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            }

            if(s.equals("top")){
                if(list.size() == 0){
                    sb.append(-1).append('\n');
                } else {
                    sb.append(list.get(list.size()-1)).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}