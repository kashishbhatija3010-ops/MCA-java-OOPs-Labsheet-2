package labsheet2;
import java.util.Scanner;

class Interest {
    double principal, rate, time;
    Interest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    double calculateAmount() {
        return principal * Math.pow((1 + rate / 100), time);
    }
    double calculateCI() {
        return calculateAmount() - principal;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter time: ");
        double t = sc.nextDouble();
        Interest obj = new Interest(p, r, t);
        System.out.println("Compound Interest = " + obj.calculateCI());
        sc.close();
    }
}
