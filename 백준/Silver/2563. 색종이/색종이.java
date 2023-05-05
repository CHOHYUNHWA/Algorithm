import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int[][] drawingPaper = new int [100][100];
        int N = sc.nextInt();
        int paperLength = 10;
        int answer = 0;
        for(int i = 0; i< N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = 0; j< paperLength; j++){
                for(int k = 0; k< paperLength; k++){
                    drawingPaper[x+j][y+k]++;
                }
            }
        }
        for(int i = 0; i<drawingPaper.length; i++){
            for(int j = 0; j< drawingPaper.length; j++){
                if(drawingPaper[i][j] != 0){
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
