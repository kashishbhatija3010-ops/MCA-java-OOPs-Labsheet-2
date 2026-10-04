package labsheet2;
import java.util.Scanner;

class PasswordChecker {
    String correctPassword = "java123";
    boolean checkPassword(String password) {
        return password.equals(correctPassword);
    }
}

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordChecker obj = new PasswordChecker();
        String password;
        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
            if (!obj.checkPassword(password))
                System.out.println("Incorrect password.");
        } while (!obj.checkPassword(password));
        System.out.println("Correct password. Access granted.");
        sc.close();
    }
}