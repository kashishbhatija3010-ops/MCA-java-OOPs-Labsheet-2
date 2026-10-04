package labsheet2;
import java.util.Scanner;

class Number {
    int value;
    Number(int value) {
        this.value = value;
    }
    int getNegative() {
        return -value;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        Number obj = new Number(n);
        System.out.println("Negative value = " + obj.getNegative());
        sc.close();
    }
}
