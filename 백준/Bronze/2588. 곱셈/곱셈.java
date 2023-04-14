import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int tmpInt = y;
        List<Integer> tmp = new ArrayList<Integer>();
        while(tmpInt>0){
            tmp.add(tmpInt%10);
            tmpInt /= 10;
        }
        for(int i = 0; i<tmp.size(); i++){
            System.out.println(x*tmp.get(i));
        }
        System.out.println(x*y);
    }
}
