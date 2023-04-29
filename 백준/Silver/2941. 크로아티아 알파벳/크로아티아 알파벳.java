import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s+"  ";
        int count = 0;
        for(int i = 0; i <s.length(); i++) {
            if(s.charAt(i) == 'c' && s.charAt(i+1) == '=') {
                count++;
                i++;
            } else if(s.charAt(i) == 'c' && s.charAt(i+1) == '-'){
                count++;
                i++;
            } else if(s.charAt(i) == 'd' && s.charAt(i+1) == 'z' && s.charAt(i+2) == '='){
                count++;
                i += 2;
            } else if(s.charAt(i) == 'd' && s.charAt(i+1) == '-') {
                count++;
                i ++;
            } else if(s.charAt(i) == 'l' && s.charAt(i+1) == 'j') {
                count++;
                i++;
            }
            else if(s.charAt(i) == 'n' && s.charAt(i+1) == 'j') {
                count++;
                i++;
            } else if(s.charAt(i) == 's' && s.charAt(i+1) == '=') {
                count++;
                i++;
            }else if(s.charAt(i) == 'z' && s.charAt(i+1) == '=') {
                count++;
                i++;
            } else if(s.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}