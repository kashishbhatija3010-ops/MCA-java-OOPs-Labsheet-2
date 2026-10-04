package labsheet2;
import java.util.Scanner;

class YearCheck {
    int year, start, end;
    YearCheck(int year, int start, int end) {
        this.year = year;
        this.start = start;
        this.end = end;
    }
    boolean isValid() {
        boolean leapYear = (year % 400 == 0) ||
                           (year % 4 == 0 && year % 100 != 0);
        boolean inRange = year >= start && year <= end;
        return leapYear && inRange;
    }
}
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter starting year: ");
        int start = sc.nextInt();
        System.out.print("Enter ending year: ");
        int end = sc.nextInt();
        YearCheck obj = new YearCheck(year, start, end);
        if (obj.isValid())
            System.out.println("Year is a leap year and within the range.");
        else
            System.out.println("Condition not satisfied.");
        sc.close();
    }
}
