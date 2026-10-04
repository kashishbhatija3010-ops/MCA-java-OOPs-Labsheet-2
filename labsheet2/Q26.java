package labsheet2;
import java.util.Scanner;

class DayChecker {
    int day;
    DayChecker(int day) {
        this.day = day;
    }
    void checkDay() {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        DayChecker obj = new DayChecker(day);
        obj.checkDay();
        sc.close();
    }
}