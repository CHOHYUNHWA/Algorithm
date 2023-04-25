import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] sArr = s.split("");
        String[] alphabetArr = alphabet.split("");
        int[] answerArr = new int[alphabet.length()];
        for(int i =0; i< answerArr.length; i++){
            answerArr[i] = -1;
        }
        for(int i = 0; i< alphabetArr.length; i++) {
            for(int j = 0; j < sArr.length; j++) {
                if(sArr[j].equals(alphabetArr[i]) && answerArr[i] == -1){
                    answerArr[i] = j;
                }
            }
        }
        for(int i = 0; i < answerArr.length; i++){
            System.out.print(answerArr[i] + " ");
        }
    }
}
