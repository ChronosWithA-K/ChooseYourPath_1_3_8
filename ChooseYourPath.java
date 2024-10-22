import java.util.Scanner;

public class ChooseYourPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        boolean symbol1 = false;
        boolean symbol2 = false;
        boolean symbol3 = false;

        System.out.println("All inputs have to be an integer, with no other characters. They have to be one of the given options.");

        while (true) {
            System.out.println("You wake up in a roughly 10x10x10 feet cubed room. It is dimly lit. You see a misshapen lump in the corner. What do you want to do:");
            System.out.println("(1) Look around more");
            System.out.println("(2) Investigate the lump");

            choice = sc.nextLine();
            if (inputLegalityChecker(choice) && (choice.equals("1") || choice.equals("2"))) {
                if (choice.equals("1")) {
                    System.out.println("There is a cabinet in the corner of the room. There is also a bed in the corner.");
                } else {
                    System.out.println("You investigate the lump, which turns out to be a body. You find what appears to be a symbol fragment.");
                    symbol1 = true;
                }
            } else {
                clearTerminal();
                System.out.println("Invalid input. Please enter either '1' or '2'.");
            }
        }
    }

    public static boolean inputLegalityChecker(String userInput) {
        return userInput.length() == 1 && Character.isDigit(userInput.charAt(0));
    }

    public static void clearTerminal() {
        // https://stackoverflow.com/a/10241460/22870173
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
