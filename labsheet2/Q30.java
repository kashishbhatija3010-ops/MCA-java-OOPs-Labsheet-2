package labsheet2;
import java.util.Scanner;

class NumberOperations {
    int number;
    NumberOperations(int number) {
        this.number = number;
    }
    boolean isPowerOfFour() {
        if (number <= 0)
            return false;
        while (number % 4 == 0)
            number /= 4;
        return number == 1;
    }
    int toggleThirdBit() {
        return number ^ (1 << 2);
    }
    void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            if (result % 6 == 0)
                continue;
            if (result % 48 == 0)
                break;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        NumberOperations obj = new NumberOperations(number);
        if (obj.isPowerOfFour())
            System.out.println("Number is a power of 4.");
        else
            System.out.println("Number is not a power of 4.");
        System.out.println("After toggling 3rd bit = " + obj.toggleThirdBit());
        System.out.println("Multiplication table:");
        obj.multiplicationTable();
        sc.close();
    }
}