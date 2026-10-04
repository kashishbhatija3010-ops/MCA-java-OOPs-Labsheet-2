package labsheet2;
import java.util.Scanner;

class FactorFinder {
    int number;
    FactorFinder(int number) {
        this.number = number;
    }
    void displayFactors() {
        int i = 1;
        do {
            if (number % i == 0)
                System.out.print(i + " ");
            i++;
        } while (i <= number);
    }
}

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        FactorFinder obj = new FactorFinder(number);
        System.out.print("Factors: ");
        obj.displayFactors();
        sc.close();
    }
}
