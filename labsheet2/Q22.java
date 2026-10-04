package labsheet2;
import java.util.Scanner;

class NumberReverse {
    int number;
    NumberReverse(int number) {
        this.number = number;
    }
    int reverse() {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        NumberReverse obj = new NumberReverse(number);
        System.out.println("Reversed number = " + obj.reverse());
        sc.close();
    }
}
