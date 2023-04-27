import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String tmp = "";
        char tmpChar = ' ';
        char[] sArr = s.toCharArray();
        int count = sArr.length-1;
        for(int i = 0; i < sArr.length/2; i++){
            tmpChar = sArr[i];
            sArr[i] = sArr[count];
            count--;
        }
        tmp = String.valueOf(sArr);
        if(s.equals(tmp)){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}