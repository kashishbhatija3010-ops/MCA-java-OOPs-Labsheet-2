package labsheet2;
import java.util.Scanner;

class Swapper {
    int a, b;
    Swapper(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void swap() {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
    void display() {
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swapper obj = new Swapper(a, b);
        obj.swap();
        obj.display();
        sc.close();
    }
}
