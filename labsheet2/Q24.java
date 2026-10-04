package labsheet2;
import java.util.Scanner;

class ArrayValues {
    int[] numbers;
    ArrayValues(int[] numbers) {
        this.numbers = numbers;
    }
    void findValues() {
        int maximum = numbers[0];
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number > maximum)
                maximum = number;
            if (number < minimum)
                minimum = number;
        }
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);
    }
}
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();
        ArrayValues obj = new ArrayValues(numbers);
        obj.findValues();
        sc.close();
    }
}