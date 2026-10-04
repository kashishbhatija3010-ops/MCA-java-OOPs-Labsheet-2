package labsheet2;
import java.util.Scanner;

class Palindrome {
    int number;
    Palindrome(int number) {
        this.number = number;
    }
    boolean isPalindrome() {
        int original = number;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return original == reverse;
    }
}
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Palindrome obj = new Palindrome(number);
        if (obj.isPalindrome())
            System.out.println("Number is a palindrome.");
        else
            System.out.println("Number is not a palindrome.");
        sc.close();
    }
}
