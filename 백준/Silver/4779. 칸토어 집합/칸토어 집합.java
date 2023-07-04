import java.io.*;


public class Main {
    static char[] charArr;
    static StringBuilder answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = br.readLine()) != null){
            int N = Integer.parseInt(input);
            answer = new StringBuilder();
            int length = (int) Math.pow(3, N);
            for(int i = 0; i < length; i++){
                answer.append('-');
            }
            cantor(0,length);
            System.out.println(answer);
        }
    }

    private static void cantor(int start, int length) {
        if(length == 1){
            return;
        }
        int divideLength = length/3;
        for(int i = start + divideLength; i < start + divideLength*2; i++){
            answer.setCharAt(i, ' ');
        }
        cantor(start,divideLength);
        cantor(start+ divideLength*2 , divideLength);
    }
}