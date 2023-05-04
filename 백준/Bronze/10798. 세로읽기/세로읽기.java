import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] cArr = new char[5][15];
        for(int i = 0; i< cArr.length; i++){
                char[] tmp = br.readLine().toCharArray();
                for(int j = 0; j< tmp.length; j++){
                    cArr[i][j] = tmp[j];
                }
            }
        for(int i = 0 ; i< 15; i++){
            for(int j = 0; j<5; j++){
                if(cArr[j][i] != '\0'){
                    sb.append(cArr[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}