package labsheet2;
import java.util.Scanner;

class NumberReducer {
    double number;
    NumberReducer(double number) {
        this.number = number;
    }
    int countSteps() {
        int steps = 0;
        while (number >= 1) {
            number /= 2;
            steps++;
        }
        return steps;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        NumberReducer obj = new NumberReducer(n);
        System.out.println("Number of steps = " + obj.countSteps());
        sc.close();
    }
}
