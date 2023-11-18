import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = new String[str.length()];
        for(int i  = 0 ; i < strArr.length; i++){
            strArr[i] = str.substring(i, str.length());
        }
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}