import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        minute = minute -45;
        if(minute < 0){
            hour = hour -1;
            minute = 60+minute;
        }
        if(hour <0){
            hour = 24+hour;
        }
        System.out.println(hour + " " + minute);
    }
}