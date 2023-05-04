import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String[] sArr = new String[5];
        char[][] cArr = new char[5][15];
        for(int i = 0; i < sArr.length; i++){
            sArr[i] = sc.nextLine();
        }
        for(int i = 0; i<cArr.length; i++){
            Arrays.fill(cArr[i], '\0');
        }
        for(int i = 0; i< sArr.length; i++){
            for(int j = 0; j < sArr[i].length(); j++){
                cArr[i][j] = sArr[i].charAt(j);
            }
        }
        for(int i = 0; i<15; i++){
            for(int j = 0; j<5; j++){
                if(cArr[j][i] !='\0'){
                    sb.append(cArr[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}