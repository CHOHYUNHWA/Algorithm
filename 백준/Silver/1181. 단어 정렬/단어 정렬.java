import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N  = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for(int i = 0; i< N; i++){
            set.add(String.valueOf(br.readLine()));
        }
        String[] sArr = set.toArray(new String[set.size()]);
        Arrays.sort(sArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) != o2.charAt(i)) {
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }
                }
                return o1.length() - o2.length();
            }
        });
        for(int i = 0; i<sArr.length; i++){
            sb.append(sArr[i]).append(" ");
        }
        System.out.println(sb);
    }
}