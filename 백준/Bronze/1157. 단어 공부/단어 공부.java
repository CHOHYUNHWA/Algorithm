import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        String[] sArr = s.split("");
        List<String> sList = new ArrayList<String>();
        for(int i = 0; i < sArr.length; i++){
            sList.add(sArr[i]);
        }
        Set<String> set = new HashSet<String>(sList);
        sList = new ArrayList<String>(set);
        int[] iArr = new int[set.size()];
        for(int i = 0; i < sList.size(); i++){
            for(int j = 0; j < sArr.length; j++){
                if(sList.get(i).equals(sArr[j])){
                    iArr[i]++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        String maxString = "";
        for(int i = 0; i < iArr.length; i++){
            if(max < iArr[i]){
                maxString = sList.get(i);
                max = iArr[i];
            }
            for(int j = i+1; j < iArr.length; j++){
                if(iArr[i] == iArr[j] && iArr[i] == max){
                    maxString = "?";
                }
            }
        }
        System.out.println(maxString);
    }
}
