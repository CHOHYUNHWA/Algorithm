import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];
        int[] rotationBasket =  new int[N];
        for(int i = 0; i<N; i++) {
            basket[i] = i+1;
        }

        for(int i = 0; i<M; i++) {
            int begin = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            int mid = sc.nextInt() - 1;
            int tmp = begin;
            for(int j = 0; j < end - begin+1; j++){
                if(j+mid <= end){
                    rotationBasket[j+begin] = basket[j+mid];
                }
                else {
                    rotationBasket[j+begin]  = basket[tmp];
                    tmp++;
                }
            }
            for(int j = 0; j< N; j++){
                if(rotationBasket[j] != 0)basket[j] = rotationBasket[j];
            }
        }
        for(int i = 0; i<N; i++){
            sb.append(basket[i]).append(" ");
        }
        System.out.println(sb);
    }
}