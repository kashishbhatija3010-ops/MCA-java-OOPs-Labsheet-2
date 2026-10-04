package labsheet2;
import java.util.Scanner;

class Rainfall {
    double total;
    void addRainfall(double rainfall) {
        total += rainfall;
    }
    double getTotal() {
        return total;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rainfall obj = new Rainfall();
        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter rainfall for day " + i + ": ");
            double rainfall = sc.nextDouble();
            obj.addRainfall(rainfall);
        }
        System.out.println("Total rainfall = " + obj.getTotal());
        sc.close();
    }
}
