package labsheet2;
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
