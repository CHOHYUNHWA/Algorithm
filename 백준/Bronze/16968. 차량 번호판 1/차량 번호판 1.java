import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] carNumber = br.readLine().split("");
        int c = 26;
        int d = 10;
        int result = 1;

        for(int i = 0 ; i < carNumber.length; i++){
            if( 0 < i && carNumber[i].equals(carNumber[i-1])){
                if(carNumber[i].equals("c")){
                    if(c != 25){
                        c--;
                    }
                } else {
                    if(d != 9){
                        d--;
                    }
                }
            } else if ( 0 < i && !carNumber[i].equals(carNumber[i-1])){
                c = 26;
                d = 10;
            }
            if(carNumber[i].equals("c")){
                result *= c;
            } else {
                result *= d;
            }
        }
        System.out.println(result);
    }
}