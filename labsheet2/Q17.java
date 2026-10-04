package labsheet2;
import java.util.Scanner;

class BitRotator {
    int number;
    BitRotator(int number) {
        this.number = number;
    }
    int rotateLeft() {
        return (number << 2) | (number >>> 30);
    }
}

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        BitRotator obj = new BitRotator(number);
        System.out.println("After left rotation by 2 bits = " + obj.rotateLeft());
        sc.close();
    }
}
