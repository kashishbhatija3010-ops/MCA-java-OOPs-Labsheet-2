package labsheet2;
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
