package labsheet2;
import java.util.Scanner;

class BitCounter {
    int number;
    BitCounter(int number) {
        this.number = number;
    }
    int countBits() {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number = number >> 1;
        }
        return count;
    }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        BitCounter obj = new BitCounter(n);
        System.out.println("Number of set bits = " + obj.countBits());
        sc.close();
    }
}
