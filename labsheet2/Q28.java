package labsheet2;
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
