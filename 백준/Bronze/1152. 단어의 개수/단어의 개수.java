import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sArr = s.split(" ");
        int answer = 0;
        for(int i = 0; i < sArr.length; i++) {
            if(!sArr[i].equals("")){
                answer++;
            }
        }
        System.out.println(answer);
    }
}