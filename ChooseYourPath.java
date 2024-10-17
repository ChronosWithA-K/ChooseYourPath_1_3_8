
import java.util.Scanner;

public class ChooseYourPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("You are on a path in the woods. And at the end of that path is a cabin. And in the basement of that cabin is a prince(ss). You're here to slay him(her). If you don't, it will be the end of the world.");
        }
    }

    public static boolean inputLegalityChecker(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            if ((Character.isDigit(userInput.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
}
