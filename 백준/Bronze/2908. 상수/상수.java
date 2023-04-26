import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);
        String[] aStringArr = aString.split("");
        String[] bStringArr = bString.split("");
        String aTmp = aStringArr[0];
        String bTmp = bStringArr[0];
        aStringArr[0] = aStringArr[2];
        bStringArr[0] = bStringArr[2];
        aStringArr[2] = aTmp;
        bStringArr[2] = bTmp;
        String aAnswer = "";
        String bAnswer = "";
        for(int i = 0; i< aStringArr.length; i++){
            aAnswer += aStringArr[i];
            bAnswer += bStringArr[i];
        }
        a = Integer.parseInt(aAnswer);
        b = Integer.parseInt(bAnswer);
        System.out.println(Math.max(a, b));
    }
}
