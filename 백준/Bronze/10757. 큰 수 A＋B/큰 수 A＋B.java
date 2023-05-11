import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String A = st.nextToken();
        String B = st.nextToken();
        int max = Math.max(A.length(),B.length());
        int min = Math.min(A.length(),B.length());
        int count = max - min;
        if(A.length() > B.length()){
            for(int i = 0; i < count; i++){
                B = "0"+B;
            }
        }else if (B.length() > A.length()) {
            for (int i = 0; i < count; i++) {
                A = "0" + A;
            }
        }
            int[] aArr = new int[A.length()];
            int[] bArr = new int[B.length()];
            int[] answerArr = new int[A.length()];
            for (int i = 0; i < A.length(); i++) {
                aArr[i] = Character.getNumericValue(A.charAt(i));
                bArr[i] = Character.getNumericValue(B.charAt(i));
                answerArr[i] = aArr[i]+bArr[i];
            }
            for(int i = answerArr.length-1; i>0; i--) {
                if(answerArr[i]>= 10){
                    answerArr[i-1] += answerArr[i]/10;
                    answerArr[i] = answerArr[i]%10;
                }
            }
            for(int i = 0; i<answerArr.length; i++) {
                sb.append(answerArr[i]);
            }
        System.out.println(sb);
    }
}