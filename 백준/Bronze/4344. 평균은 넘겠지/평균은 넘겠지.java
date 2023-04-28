import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int sum = 0;
            int answer = 0;
            int count = sc.nextInt();
            int[] countArr = new int[count];
            for(int j = 0; j < count; j++){
                countArr[j] = sc.nextInt();
                sum += countArr[j];
            }
            for(int k = 0; k < countArr.length; k++){
                double avg = sum/countArr.length;
                if(avg < countArr[k]){
                    answer++;
                }
            }
            double tmp = (double)(answer)/(double)(countArr.length)*100;
            System.out.printf("%.3f",tmp);
            System.out.print("%"+" ");
        }
    }
}