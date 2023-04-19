import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //끊어진 기타줄의 개수
        int M = sc.nextInt(); //브랜드 갯수
        int answer = 0;
        int[] pack = new int[M];
        int[] unit = new int[M];
        for(int i = 0; i<M; i++){
            pack[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }
        Arrays.sort(pack);
        Arrays.sort(unit);
        int min = Integer.MAX_VALUE;
        if(N%6 == 0){
            min = Math.min(pack[0]*(N/6),unit[0]*N);
        }
        else{
            min = Math.min(pack[0]*(N/6+1),unit[0]*N);
            min = Math.min(min, pack[0]*(N/6)+unit[0]*(N%6));
        }
        System.out.println(min);
    }
}