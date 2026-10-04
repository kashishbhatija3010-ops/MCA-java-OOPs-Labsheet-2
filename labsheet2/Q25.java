package labsheet2;
import java.util.Scanner;

class MarksCalculator {
    int[][] marks;
    MarksCalculator(int[][] marks) {
        this.marks = marks;
    }
    double calculateAverage() {
        int total = 0;
        int count = 0;
        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }
        return (double) total / count;
    }
}
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter subjects per student: ");
        int subjects = sc.nextInt();
        int[][] marks = new int[students][subjects];
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }
        MarksCalculator obj = new MarksCalculator(marks);
        System.out.println("Average marks = " + obj.calculateAverage());
        sc.close();
    }
}
