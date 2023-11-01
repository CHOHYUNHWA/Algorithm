import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();

        p = p.replaceAll("XXXX", "AAAA");
        p = p.replaceAll("XX", "BB");

        if(p.contains("X")){
            p = "-1";
        }
        System.out.println(p);
    }
}