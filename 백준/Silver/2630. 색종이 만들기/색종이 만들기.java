import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] colorPaper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        colorPaper = new int[N][N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                colorPaper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dividePaper(0,0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void dividePaper(int row, int col, int size) {
        if (checkColor(row, col, size)) {
            if (colorPaper[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newSize = size/2;
        dividePaper(row,col,newSize);
        dividePaper(row,col+ newSize,newSize);
        dividePaper(row + newSize, col,newSize);
        dividePaper(row+newSize, col+newSize, newSize);

    }

    private static boolean checkColor(int row, int col, int size){
        int color = colorPaper[row][col];

        for(int i = row; i < row + size; i++){
            for(int j = col; j < col + size; j++){
                if(colorPaper[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
}