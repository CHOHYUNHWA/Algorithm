import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int gcd = arr[1]- arr[0];
        for(int i = 1 ; i < arr.length-1; i++){
            int tmp = arr[i+1] - arr[i];
            gcd = getGCD(tmp,gcd);
        }
        int total = (arr[arr.length-1]-arr[0])/gcd+1;
        System.out.println(total - N);
    }
    static int getGCD(int num1 , int num2){
        if(num1%num2==0){
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}