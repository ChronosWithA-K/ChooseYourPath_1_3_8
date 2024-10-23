import java.util.Scanner;

public class ChooseYourPath {
    static Scanner sc = new Scanner(System.in);
    static String choice;
    static boolean bodySymbol = false;
    static boolean bedSymbol = false;
    static boolean cabinetSymbol = false;
    public static void main(String[] args) {
        // clearTerminal();
        System.out.println("All inputs have to be an integer, with no other characters. They have to be one of the given options.\n");
        System.out.println("You wake up in a roughly 10x10x10 feet cubed room. It is dimly lit.");
         while (true) {
            lookAround();

            if (bodySymbol && bedSymbol && cabinetSymbol) {
                System.out.println("You go to the door with trembling fingers. Slowly, you put the pieces of the symbol into the door, and you push it open.");
                System.out.println("A heavenly orator ascends from the ground and belts out:\n");
                System.out.println("Old Godzilla was hopping around\r\n" + //
                                        "Tokyo City like a big playground\r\n" + //
                                        "When suddenly Batman burst from the shade\r\n" + //
                                        "And hit Godzilla with a Batgrenade\r\n" + //
                                        "Godzilla got pissed and began to attack\r\n" + //
                                        "But didn't expect to be blocked by Shaq\r\n" + //
                                        "Who proceeded to open up a can of Shaq-Fu\r\n" + //
                                        "When Aaron Carter came out of the blue\r\n" + //
                                        "And he started beating up Shaquille O'Neal\r\n" + //
                                        "Then they both got flattened by the Batmobile\r\n" + //
                                        "But before it could make it back to the Batcave\r\n" + //
                                        "Abraham Lincoln popped out of his grave\r\n" + //
                                        "And took an AK-47 out from under his hat\r\n" + //
                                        "And blew Batman away with a rat-a-tat-tat\r\n" + //
                                        "But he ran out of bullets and he ran away\r\n" + //
                                        "Because Optimus Prime came to save the day\r\n" + //
                                        "This is the ultimate showdown of ultimate destiny\r\n" + //
                                        "Good guys, bad guys, and explosions as far as the eye can see\r\n" + //
                                        "And only one will survive, I wonder who it will be\r\n" + //
                                        "This is the ultimate showdown of ultimate destiny\r\n" + //
                                        "Godzilla took a bite out of Optimus Prime\r\n" + //
                                        "Like Scruff McGruff took a bite out of crime\r\n" + //
                                        "And then Shaq came back covered in a tire track\r\n" + //
                                        "But Jackie Chan jumped out and landed on his back\r\n" + //
                                        "And Batman was injured, and trying to get steady\r\n" + //
                                        "When Abraham Lincoln came back with a machete\r\n" + //
                                        "But suddenly something caught his leg and he tripped\r\n" + //
                                        "Indiana Jones took him out with his whip\r\n" + //
                                        "Then he saw Godzilla sneaking up from behind\r\n" + //
                                        "And he reached for his gun which he just couldn't find\r\n" + //
                                        "'Cause Batman stole it and he shot and he missed\r\n" + //
                                        "And Jackie Chan deflected it with his fist\r\n" + //
                                        "Then he jumped in the air and did a somersault\r\n" + //
                                        "While Abraham Lincoln tried to pole vault\r\n" + //
                                        "Onto Optimus Prime, but they collided in the air\r\n" + //
                                        "Then they both got hit by a Care Bear stare\r\n" + //
                                        "This is the ultimate showdown of ultimate destiny\r\n" + //
                                        "Good guys, bad guys, and explosions as far as the eye can see\r\n" + //
                                        "And only one will survive, I wonder who it will be\r\n" + //
                                        "This is the ultimate showdown\r\n" + //
                                        "Angels sang out an immaculate chorus\r\n" + //
                                        "Down from the heavens descended Chuck Norris\r\n" + //
                                        "Who delivered a kick which could shatter bones\r\n" + //
                                        "Into the crotch of Indiana Jones\r\n" + //
                                        "Who fell over on the ground, writhing in pain\r\n" + //
                                        "As Batman changed back into Bruce Wayne\r\n" + //
                                        "But Chuck saw through his clever disguise\r\n" + //
                                        "And he crushed Batman's head in between his thighs\r\n" + //
                                        "Then Gandalf the Grey and Gandalf the White\r\n" + //
                                        "And Monty Python and the Holy Grail's black knight\r\n" + //
                                        "And Benito Mussolini and the Blue Meanie\r\n" + //
                                        "And Cowboy Curtis and Jambi the Genie\r\n" + //
                                        "Robocop, The Terminator, Captain Kirk, and Darth Vader\r\n" + //
                                        "Lo-pan, Superman, every single Power Ranger\r\n" + //
                                        "Bill S. Preston and Theodore Logan\r\n" + //
                                        "Spock, The Rock, Doc Ock, and Hulk Hogan\r\n" + //
                                        "All came out of nowhere lightning fast\r\n" + //
                                        "And they kicked Chuck Norris in his cowboy [behind]\r\n" + //
                                        "It was the bloodiest battle that the world ever saw\r\n" + //
                                        "With civilians looking on in total awe\r\n" + //
                                        "The fight raged on for a century\r\n" + //
                                        "Many lives were claimed, but eventually\r\n" + //
                                        "The champion stood, the rest saw their better\r\n" + //
                                        "Mr. Rogers in a bloodstained sweater\r\n" + //
                                        "This is the ultimate showdown of ultimate destiny\r\n" + //
                                        "Good guys, bad guys, and explosions as far as the eye can see\r\n" + //
                                        "And only one will survive, I wonder who it will be\r\n" + //
                                        "This is the ultimate showdown\r\n" + //
                                        "(The ultimate showdown)\r\n" + //
                                        "This is the ultimate showdown\r\n" + //
                                        "(The ultimate showdown)\r\n" + //
                                        "This is the ultimate showdown\r\n" + //
                                        "Of ultimate destiny\n");
                System.out.println("Also, you should download TempleOS.\n");
                System.out.println("With that, the messengr takes the completed symbol from the door, tosses it away, shoves you back inside the room, and slams the door shut.");
                System.out.println("Understandably, you are befuddled, addled, bewildered, muddled, disoriented, baffled, perplexed, confuesd, dazed, mystified, confounded, and one might even say: utterly clueless about what was just happened, so much so that you don't even get upset at once more being trapped - instead, you just sit on the floor, re-thinking your entire futile existence flippled every which way by this turn of events.");
                break;
            }
        }
    }

    public static void clearTerminal() {
        // https://stackoverflow.com/a/10241460/22870173
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean inputLegalityChecker(String userInput) {
        return userInput.length() == 1 && Character.isDigit(userInput.charAt(0));
    }   

    // User action methods below
    public static void lookAround() {
        System.out.println("There is a cabinet in the corner of the room. There is also a bed in the corner. There is a misshapen lump in the corner. A door is set in the wall.");
        System.out.println("(1) Investigate cabinet");
        System.out.println("(2) Investigate bed");
        System.out.println("(3) Investigate lump");
        System.out.println("(4) Investigate door");
        

        choice = sc.nextLine();
        if (inputLegalityChecker(choice) && (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4"))) {
            if (choice.equals("1")) {
                investigateCabinet();
            } else if (choice.equals("2")) {
                investigateBed();
            } else if (choice.equals("3")) {
                investigateLump();
            } else {
                investigateDoor();
            }
        }
    }

    public static void investigateCabinet() {
        if (!cabinetSymbol) {
            System.out.print("You investigate the cabinet. You find a small puzzle box. You shake it, and something rattles within. You spend some time on it, solve it, ");
            System.out.println("and what appears to be a symbol fragment comes out.");
            cabinetSymbol = true;
        } else {
            System.out.println("You've already investigated this.");
        }
    }

    public static void investigateBed() {
        if (!bedSymbol) {
            System.out.print("You investigate the bed. You find a small puzzle box. You shake it, and something rattles within. You spend some time on it, solve it, ");
            System.out.println("and what appears to be a symbol fragment comes out.");
            bedSymbol = true;
        } else {
            System.out.println("You've already investigated this.");
        }
    }

    public static void investigateLump() {
        if (!bodySymbol) {
            System.out.println("You investigate the lump, which turns out to be a body. You find what appears to be a symbol fragment.");
            bodySymbol = true;
        } else {
            System.out.println("You already investigated this.");
        }
    }

    public static void investigateDoor() {
        System.out.println("You investigate the door. It appears to have some kind of odd symbol on it. You can't do anything more with it for now.");
    }
}
