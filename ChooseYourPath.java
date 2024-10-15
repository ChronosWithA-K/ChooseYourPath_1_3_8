
import java.util.Scanner;

public class ChooseYourPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    public static boolean inputLegalityChecker(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            if ((Character.isLetter(userInput.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
}
