import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int count = sc.nextInt();
        int countHour = 0;
        int countMinute = 0;
        countHour = count/60;
        countMinute = count%60;
        minute = minute + countMinute;
        if(minute >= 60){
            hour = hour + 1;
            minute = minute - 60;
        }
        hour = (hour + countHour)%24;
        System.out.println(hour + " " + minute);
    }
}