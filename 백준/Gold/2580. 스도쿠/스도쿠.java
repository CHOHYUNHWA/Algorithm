import java.io.*;
import java.util.*;


public class Main {
    static int[][] sudoku = new int[9][9];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < sudoku.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < sudoku[i].length; j ++){
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(0,0);
    }
    public static void solve(int row, int col){
        if(col == 9){
            solve(row + 1, 0);
            return;
        }

        if(row == 9){
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    sb.append(sudoku[i][j]).append(" ");
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }

        if(sudoku[row][col] == 0){
            for(int i = 1; i <= 9; i++){
                if(possibility(row,col,i)){
                    sudoku[row][col] = i;
                    solve(row,col+1);
                }
            }
            sudoku[row][col] = 0;
            return;
        }
        solve(row, col+1);
    }


    public static boolean possibility(int row, int col, int value){
        for(int i = 0 ; i < 9; i++){
            if(sudoku[row][i] == value){
                return false;
            }
        }
        for(int i = 0 ; i < 9; i++){
            if(sudoku[i][col] == value){
                return false;
            }
        }

        int boxRow = (row/3) * 3;
        int boxCol = (col/3) * 3;

        for(int i = boxRow; i < boxRow +3; i++){
            for(int j = boxCol; j < boxCol + 3; j++){
                if(sudoku[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }
}