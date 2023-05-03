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
        for(int I = 0; I<M; I++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int k = sc.nextInt() - 1;
            int tmp = i;
            for (int J = 0; J < j - i + 1; J++) {
                if (k + J <= j) {
                    rotationBasket[i + J] = basket[k + J];
                } else {
                    rotationBasket[i + J] = basket[tmp];
                    tmp++;
                }
            }
            for(int K = 0; K < N; K++){
                if(rotationBasket[K] != 0){
                    basket[K] = rotationBasket[K];
                }
            }
        }
        for(int i = 0; i<N; i++){
            System.out.print(basket[i] + " ");
        }
    }
}