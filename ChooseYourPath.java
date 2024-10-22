import java.util.Scanner;

public class ChooseYourPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        boolean bodySymbol = false; // Why is this not used? It clearly is - 24:36
        boolean bedSymbol = false;
        boolean cabinetSymbol = false;

        while (true) {
            // clearTerminal();
            System.out.println(
                    "All inputs have to be an integer, with no other characters. They have to be one of the given options.\n");
            System.out.println(
                    "You wake up in a roughly 10x10x10 feet cubed room. It is dimly lit. You see a misshapen lump in the corner.");
            System.out.println("(1) Look around more");
            System.out.println("(2) Investigate the lump");

            choice = sc.nextLine();
            if (inputLegalityChecker(choice) && (choice.equals("1") || choice.equals("2"))) {
                if (choice.equals("1")) {
                    System.out.println(
                            "There is a cabinet in the corner of the room. There is also a bed in the corner. A door is set in the wall.");
                } else {
                    System.out.println(
                            "You investigate the lump, which turns out to be a body. You find what appears to be a symbol fragment.");
                    bodySymbol = true;

                    System.out.println(
                            "Now that you've investigated the body, you look around. There is a cabinet in the corner of the room. There is also a bed in the corner. A door is set in the wall.");
                    System.out.println("(1) Investigate the bed");
                    System.out.println("(2) Investgate the cabinet");
                    System.out.println("(3) Investigate the door");
                    choice = sc.nextLine();
                    if (inputLegalityChecker(choice) && (choice.equals("1") || choice.equals("2")
                            || choice.equals("3"))) {
                        if (choice.equals("1")) {
                            System.out.print(
                                    "You investigate the bed. You find a small puzzle box. You shake it, and something rattles within. You spend some time on it, solve it, ");
                            System.out.println("and another symbol fragment comes out.");
                            bedSymbol = true;
                        } else if (choice.equals("2")) {
                            System.out.println("");
                        }
                    }
                }
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
