import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];
        for(int i=1; i<student.length-2; i++){
            student[sc.nextInt()] = 1;
        }
        for(int i = 1 ; i<student.length; i++){
            if(student[i] != 1){
                int answer = i;
                System.out.println(answer);
            }
        }
    }
}