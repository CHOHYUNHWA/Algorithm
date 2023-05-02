import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String[] gradeArr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] scoreArr = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
        double totalScore = 0.0;
        double sumScore = 0.0;
        for(int i = 0; i<20; i++){
            String subject = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();
            for(int j = 0; j < gradeArr.length; j++){
                if(!grade.equals("P") && gradeArr[j].equals(grade)){
                    sumScore += score*scoreArr[j];
                    totalScore += score;
                }
            }
        }
        System.out.printf("%.6f\n",sumScore/totalScore);
    }
}