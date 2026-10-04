package labsheet2;
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
