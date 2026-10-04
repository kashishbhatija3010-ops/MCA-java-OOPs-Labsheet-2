package labsheet2;
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