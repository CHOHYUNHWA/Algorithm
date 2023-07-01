import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            boolean flag = true;
            boolean errorFlag = true;
            Deque<Integer> list = new LinkedList();
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();

            String[] strArr = arr.substring(1,arr.length()-1).split(",");

            if(!strArr[0].equals("")){
                for(int i = 0; i < strArr.length; i++){
                    list.add(Integer.parseInt(strArr[i]));
                }
            }

                for(int i = 0; i < p.length(); i++) {
                    if (p.charAt(i) == 'R') {
                        if (flag) {
                            flag = false;
                        } else {
                            flag = true;
                        }
                    }
                    if (p.charAt(i) == 'D') {
                        if(list.size() == 0){
                            sb.append("error").append('\n');
                            errorFlag = false;
                            break;
                        }
                        else if (flag) {
                            list.removeFirst();
                        } else {
                            list.removeLast();
                        }
                    }
                }
            if(!errorFlag){
                errorFlag = true;
                continue;
            }
                sb.append("[");

                if(list.size() != 0) {
                    int size = list.size();
                    if(flag){
                        for(int i = 0; i < size-1; i++){
                            sb.append(list.getFirst()).append(",");
                            list.removeFirst();
                        }
                        sb.append(list.getLast());
                    } else {
                        for(int i = size-1; i > 0; i--){
                            sb.append(list.getLast()).append(",");
                            list.removeLast();
                        }
                        sb.append(list.getFirst());
                    }
                }
                sb.append("]").append('\n');
        }
        System.out.println(sb);
    }
}