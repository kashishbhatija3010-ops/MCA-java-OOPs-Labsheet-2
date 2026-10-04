package labsheet2;
import java.util.Scanner;

class Student {
    double theory, practical, overall;
    Student(double theory, double practical, double overall) {
        this.theory = theory;
        this.practical = practical;
        this.overall = overall;
    }
    boolean isPassed() {
        return (theory >= 40 && practical >= 50) || overall >= 50;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();
        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();
        System.out.print("Enter overall percentage: ");
        double overall = sc.nextDouble();
        Student obj = new Student(theory, practical, overall);
        if (obj.isPassed())
            System.out.println("Student has passed.");
        else
            System.out.println("Student has failed.");
        sc.close();
    }
}
