import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        Integer[] bArr = new Integer[n];
        for(int i = 0; i<2 ; i++) {
            for(int j = 0; j< n; j++){
                if(i>0){
                    aArr[j] = sc.nextInt();
                } else {
                    bArr[j] = sc.nextInt();
                }
            }
        }
        Arrays.sort(aArr);
        Arrays.sort(bArr,Collections.reverseOrder());
        int answer = 0;
        for(int i = 0; i<aArr.length; i++) {
            answer += aArr[i]*bArr[i];
        }
        System.out.println(answer);
    }
}
