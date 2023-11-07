import java.io.*;
import java.util.*;

public class Main {
    static int max = 100_000;
    static boolean[] isPrime = new boolean[max+1];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        findPrime();
        int result = 0;
        for(int i = A; i <= B; i++){
            int tmp = 2;
            int count = 0;
            int element = i;
            if(!isPrime[element]){
                continue;
            }
            while(element != 1){
                if(element % tmp == 0){
                    element = element/tmp;
                    count++;
                    continue;
                }
                tmp++;
            }
            if(!isPrime[count]){
                result++;
            }
        }
        System.out.println(result);
    }
    static void findPrime(){
        isPrime[0] = isPrime[1] = true;
        for(int i = 2; i <= Math.sqrt(isPrime.length); i++){
            if(isPrime[i]){
                continue;
            }
            for(int j = i*i; j < isPrime.length; j= j+i){
                isPrime[j]= true;
            }
        }
    }
}