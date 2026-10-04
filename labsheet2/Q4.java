package labsheet2;
import java.util.Scanner;

class VisitorCounter {
    int visitors;
    VisitorCounter(int visitors) {
        this.visitors = visitors;
    }
    void entering() {
        System.out.println("Visitor entered: " + (++visitors));
    }
    void leaving() {
        System.out.println("Visitor leaving: " + (visitors--));
        System.out.println("Visitors remaining: " + visitors);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current visitors: ");
        int n = sc.nextInt();
        VisitorCounter obj = new VisitorCounter(n);
        obj.entering();
        obj.leaving();
        sc.close();
    }
}