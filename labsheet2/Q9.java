package labsheet2;
import java.util.Scanner;

class StringCompare {
    String first, second;
    StringCompare(String first, String second) {
        this.first = first;
        this.second = second;
    }
    int compare() {
        int length = Math.min(first.length(), second.length());
        for (int i = 0; i < length; i++) {
            char a = first.charAt(i);
            char b = second.charAt(i);
            if (a < b)
                return -1;
            if (a > b)
                return 1;
        }
        if (first.length() < second.length())
            return -1;
        if (first.length() > second.length())
            return 1;
        return 0;
    }
}
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = sc.nextLine();
        System.out.print("Enter second string: ");
        String second = sc.nextLine();
        StringCompare obj = new StringCompare(first, second);
        int result = obj.compare();
        if (result < 0)
            System.out.println("First string comes before second string.");
        else if (result > 0)
            System.out.println("First string comes after second string.");
        else
            System.out.println("Both strings are equal.");
        sc.close();
    }
}
