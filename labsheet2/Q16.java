package labsheet2;
import java.util.Scanner;

class ShiftCalculator {
    int number, power;
    ShiftCalculator(int number, int power) {
        this.number = number;
        this.power = power;
    }
    int multiply() {
        return number << power;
    }
    int divide() {
        return number >> power;
    }
}

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();
        ShiftCalculator obj = new ShiftCalculator(number, power);
        System.out.println("Multiplication = " + obj.multiply());
        System.out.println("Division = " + obj.divide());
        sc.close();
    }
}
