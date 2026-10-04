package labsheet2;
import java.util.Scanner;

class NumberFinder {
    int a, b, c, d;
    NumberFinder(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    int findSmallest() {
        return (a < b ? a : b) < (c < d ? c : d)
                ? (a < b ? a : b)
                : (c < d ? c : d);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        NumberFinder obj = new NumberFinder(a, b, c, d);
        System.out.println("Smallest = " + obj.findSmallest());
        sc.close();
    }
}