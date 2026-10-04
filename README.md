# MCA-java-OOPs-Labsheet-2
Labsheet 02
# 1
import java.util.Scanner;

class Triangle {
    double a, b, c;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Triangle obj = new Triangle(a, b, c);
        System.out.println("Area of triangle = " + obj.calculateArea());
        sc.close();
    }
}

# 2
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

# 3
import java.util.Scanner;

class Point {
    double x1, y1, x2, y2;
    Point(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    double calculateDistance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point obj = new Point(x1, y1, x2, y2);
        System.out.println("Distance = " + obj.calculateDistance());
        sc.close();
    }
}
# 4
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

# 5
import java.util.Scanner;

class Number {
    int value;
    Number(int value) {
        this.value = value;
    }
    int getNegative() {
        return -value;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        Number obj = new Number(n);
        System.out.println("Negative value = " + obj.getNegative());
        sc.close();
    }
}

# 6
import java.util.Scanner;

class NumberReducer {
    double number;
    NumberReducer(double number) {
        this.number = number;
    }
    int countSteps() {
        int steps = 0;
        while (number >= 1) {
            number /= 2;
            steps++;
        }
        return steps;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        NumberReducer obj = new NumberReducer(n);
        System.out.println("Number of steps = " + obj.countSteps());
        sc.close();
    }
}

# 7
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

# 8
import java.util.Scanner;

class TriangleCheck {
    int a, b, c;
    TriangleCheck(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    boolean isValid() {
        return a > 0 && b > 0 && c > 0 && (a + b + c == 180);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        TriangleCheck obj = new TriangleCheck(a, b, c);
        if (obj.isValid())
            System.out.println("Valid triangle");
        else
            System.out.println("Invalid triangle");
        sc.close();
    }
}
# 9
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
# 10
import java.util.Scanner;

class YearCheck {
    int year, start, end;
    YearCheck(int year, int start, int end) {
        this.year = year;
        this.start = start;
        this.end = end;
    }
    boolean isValid() {
        boolean leapYear = (year % 400 == 0) ||
                           (year % 4 == 0 && year % 100 != 0);
        boolean inRange = year >= start && year <= end;
        return leapYear && inRange;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter starting year: ");
        int start = sc.nextInt();
        System.out.print("Enter ending year: ");
        int end = sc.nextInt();
        YearCheck obj = new YearCheck(year, start, end);
        if (obj.isValid())
            System.out.println("Year is a leap year and within the range.");
        else
            System.out.println("Condition not satisfied.");
        sc.close();
    }
}

# 11
import java.util.Scanner;

class Student {
    double theory, practical, overall;
    Student(double theory, double practical, double overall) {
        this.theory = theory;
        this.practical = practical;
        this.overall = overall;
    }
    boolean isPassed() {
        return (theory >= 40 && practical >= 50) || overall >= 50;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();
        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();
        System.out.print("Enter overall percentage: ");
        double overall = sc.nextDouble();
        Student obj = new Student(theory, practical, overall);
        if (obj.isPassed())
            System.out.println("Student has passed.");
        else
            System.out.println("Student has failed.");
        sc.close();
    }
}
# 12
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

# 13
import java.util.Scanner;

class CharacterCheck {
    char ch;
    CharacterCheck(char ch) {
        this.ch = ch;
    }
    String check() {
        boolean letter = (ch >= 'A' && ch <= 'Z') ||
                         (ch >= 'a' && ch <= 'z');
        boolean vowel = ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U';
        return !letter
                ? ((ch >= '0' && ch <= '9') ? "Digit" : "Special Symbol")
                : (vowel ? "Vowel" : "Consonant");
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        CharacterCheck obj = new CharacterCheck(ch);
        System.out.println("Character is a " + obj.check());
        sc.close();
    }
}

# 14
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

# 15
import java.util.Scanner;

class BitCounter {
    int number;
    BitCounter(int number) {
        this.number = number;
    }
    int countBits() {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number = number >> 1;
        }
        return count;
    }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        BitCounter obj = new BitCounter(n);
        System.out.println("Number of set bits = " + obj.countBits());
        sc.close();
    }
}

# 16
import java.util.Scanner;

class ShiftCalculator {
    int number, power;
    ShiftCalculator(int number, int power) {
        this.number = number;
        this.power = power;
    }
    int multiply() {
        return number << power;
    }
    int divide() {
        return number >> power;
    }
}

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();
        ShiftCalculator obj = new ShiftCalculator(number, power);
        System.out.println("Multiplication = " + obj.multiply());
        System.out.println("Division = " + obj.divide());
        sc.close();
    }
}
# 17
import java.util.Scanner;

class BitRotator {
    int number;
    BitRotator(int number) {
        this.number = number;
    }
    int rotateLeft() {
        return (number << 2) | (number >>> 30);
    }
}

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        BitRotator obj = new BitRotator(number);
        System.out.println("After left rotation by 2 bits = " + obj.rotateLeft());
        sc.close();
    }
}
# 18
class Fibonacci {
    void display() {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

public class Q18 {
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.display();
    }
}
# 19
class Armstrong {
    boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == original;
    }
    void display() {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }
    }
}

public class Q19 {
    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        obj.display();
    }
}
# 20
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
# 21
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
# 22
import java.util.Scanner;

class NumberReverse {
    int number;
    NumberReverse(int number) {
        this.number = number;
    }
    int reverse() {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        NumberReverse obj = new NumberReverse(number);
        System.out.println("Reversed number = " + obj.reverse());
        sc.close();
    }
}
# 23
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
# 24
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
# 25
import java.util.Scanner;

class MarksCalculator {
    int[][] marks;
    MarksCalculator(int[][] marks) {
        this.marks = marks;
    }
    double calculateAverage() {
        int total = 0;
        int count = 0;
        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }
        return (double) total / count;
    }
}

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter subjects per student: ");
        int subjects = sc.nextInt();
        int[][] marks = new int[students][subjects];
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }
        MarksCalculator obj = new MarksCalculator(marks);
        System.out.println("Average marks = " + obj.calculateAverage());
        sc.close();
    }
}
# 26
import java.util.Scanner;

class DayChecker {
    int day;
    DayChecker(int day) {
        this.day = day;
    }
    void checkDay() {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        DayChecker obj = new DayChecker(day);
        obj.checkDay();
        sc.close();
    }
}

# 27
import java.util.Scanner;

class GradeChecker {
    char grade;
    GradeChecker(char grade) {
        this.grade = Character.toUpperCase(grade);
    }
    void displayMeaning() {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (A-F): ");
        char grade = sc.next().charAt(0);
        GradeChecker obj = new GradeChecker(grade);
        obj.displayMeaning();
        sc.close();
    }
}
# 28
class SquareChecker {
    boolean isPerfectSquare(int number) {
        int root = (int) Math.sqrt(number);
        return root * root == number;
    }
    void display() {
        for (int i = 1; i <= 50; i++) {
            if (isPerfectSquare(i))
                continue;
            System.out.print(i + " ");
        }
    }
}

public class Q28 {
    public static void main(String[] args) {
        SquareChecker obj = new SquareChecker();
        obj.display();
    }
}
# 29
import java.util.Random;

class RandomNumber {
    void generate() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100) + 1;
            System.out.println("Generated: " + number);
            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Found: " + number);
                break;
            }
        }
    }
}

public class Q29 {
    public static void main(String[] args) {
        RandomNumber obj = new RandomNumber();
        obj.generate();
    }
}
# 30
import java.util.Scanner;

class NumberOperations {
    int number;
    NumberOperations(int number) {
        this.number = number;
    }
    boolean isPowerOfFour() {
        if (number <= 0)
            return false;
        while (number % 4 == 0)
            number /= 4;
        return number == 1;
    }
    int toggleThirdBit() {
        return number ^ (1 << 2);
    }
    void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            if (result % 6 == 0)
                continue;
            if (result % 48 == 0)
                break;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        NumberOperations obj = new NumberOperations(number);
        if (obj.isPowerOfFour())
            System.out.println("Number is a power of 4.");
        else
            System.out.println("Number is not a power of 4.");
        System.out.println("After toggling 3rd bit = " + obj.toggleThirdBit());
        System.out.println("Multiplication table:");
        obj.multiplicationTable();
        sc.close();
    }
}
