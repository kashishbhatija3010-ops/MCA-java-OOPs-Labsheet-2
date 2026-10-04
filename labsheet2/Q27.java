package labsheet2;
import java.util.Scanner;

class GradeChecker {
    char grade;
    GradeChecker(char grade) {
        this.grade = Character.toUpperCase(grade);
    }
    void displayMeaning() {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (A-F): ");
        char grade = sc.next().charAt(0);
        GradeChecker obj = new GradeChecker(grade);
        obj.displayMeaning();
        sc.close();
    }
}