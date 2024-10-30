import java.util.Scanner;
import java.util.concurrent.TimeUnit; // Used for delays in the heavenly oration

public class ChooseYourPath {
    static Scanner sc = new Scanner(System.in);
    static String choice;
    static boolean bodySymbol = false;
    static boolean bedSymbol = false;
    static boolean cabinetSymbol = false;
    static boolean escaped = false;
    public static void main(String[] args) throws InterruptedException {
        clearTerminal();
        System.out.println("All inputs have to be an integer, with no other characters. They have to be one of the given options.\n");
        System.out.println("You wake up in a roughly 10x10x10 feet cubed room. It is dimly lit. You look around.");
         while (true) {
            lookAround();
            if (escaped) {
                break;
            }
        }
    }

    public static void clearTerminal() {
        // https://stackoverflow.com/a/10241460/22870173
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     *
     * @param userInput
     * @return whether the userInput is a single character and whether that character is an int
     */
    public static boolean inputLegalityChecker(String userInput) {
        return userInput.length() == 1 && Character.isDigit(userInput.charAt(0));
    }   

    // User action methods below

    public static void lookAround() throws InterruptedException {
        clearTerminal();
        System.out.println("There is a cabinet in the corner of the room. There is also a bed in the corner. There is a misshapen lump in the corner. A door is set in the wall.");
        System.out.println("(1) Investigate cabinet");
        System.out.println("(2) Investigate bed");
        System.out.println("(3) Investigate lump");
        System.out.println("(4) Investigate door");
        

        choice = sc.nextLine();
        if (inputLegalityChecker(choice) && ((choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")))) {
            if (choice.equals("1")) {
                investigateCabinet();
            } else if (choice.equals("2")) {
                investigateBed();
            } else if (choice.equals("3")) {
                investigateLump();
            } else if (choice.equals("4")) {
                investigateDoor();
            }
        } else {
            System.out.println("That is not a valid input. Please put in a valid input.");
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

    public static void investigateDoor() throws InterruptedException {
        if (!bodySymbol || !bedSymbol || !cabinetSymbol) {
            System.out.println("You investigate the door. It appears to have some kind of odd symbol on it. You can't do anything more with it for now.");
        } else {
            if (bodySymbol && bedSymbol && cabinetSymbol) {
                songAndDance();
            }
        }
    }

    public static void songAndDance() throws InterruptedException {
        System.out.println("\nYou go to the door with trembling fingers. Slowly, you put the pieces of the symbol into the door, and you push it open.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("A heavenly orator ascends from the ground and belts out:\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Old Godzilla was hopping around");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Tokyo City like a big playground");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("When suddenly Batman burst from the shade");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And hit Godzilla with a Batgrenade");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Godzilla got [angered] and began to attack");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("But didn't expect to be blocked by Shaq");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Who proceeded to open up a can of Shaq-Fu");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("When Aaron Carter came out of the blue");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And he started beating up Shaquille O'Neal");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Then they both got flattened by the Batmobile");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("But before it could make it back to the Batcave");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Abraham Lincoln popped out of his grave");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And took an AK-47 out from under his hat");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And blew Batman away with a rat-a-tat-tat");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("But he ran out of bullets and he ran away");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Because Optimus Prime came to save the day");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This is the ultimate showdown of ultimate destiny");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Good guys, bad guys, and explosions as far as the eye can see");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And only one will survive, I wonder who it will be");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This is the ultimate showdown of ultimate destiny");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Godzilla took a bite out of Optimus Prime");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Like Scruff McGruff took a bite out of crime");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And then Shaq came back covered in a tire track");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("But Jackie Chan jumped out and landed on his back");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And Batman was injured, and trying to get steady");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("When Abraham Lincoln came back with a machete");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("But suddenly something caught his leg and he tripped");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Indiana Jones took him out with his whip");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Then he saw Godzilla sneaking up from behind");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And he reached for his gun which he just couldn't find");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("'Cause Batman stole it and he shot and he missed");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And Jackie Chan deflected it with his fist");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Then he jumped in the air and did a somersault");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("While Abraham Lincoln tried to pole vault");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Onto Optimus Prime, but they collided in the air");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Then they both got hit by a Care Bear stare");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This is the ultimate showdown of ultimate destiny");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Good guys, bad guys, and explosions as far as the eye can see");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And only one will survive, I wonder who it will be");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This is the ultimate showdown");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Angels sang out an immaculate chorus");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Down from the heavens descended Chuck Norris");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Who delivered a kick which could shatter bones");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Into the crotch of Indiana Jones");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Who fell over on the ground, writhing in pain");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("As Batman changed back into Bruce Wayne");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("But Chuck saw through his clever disguise");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And he crushed Batman's head in between his thighs");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Then Gandalf the Grey and Gandalf the White");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And Monty Python and the Holy Grail's black knight");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And Benito Mussolini and the Blue Meanie");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And Cowboy Curtis and Jambi the Genie");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Robocop, The Terminator, Captain Kirk, and Darth Vader");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Lo-pan, Superman, every single Power Ranger");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Bill S. Preston and Theodore Logan");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Spock, The Rock, Doc Ock, and Hulk Hogan");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("All came out of nowhere lightning fast");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And they kicked Chuck Norris in his cowboy [behind]");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("It was the bloodiest battle that the world ever saw");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("With civilians looking on in total awe");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("The fight raged on for a century");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Many lives were claimed, but eventually");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("The champion stood, the rest saw their better");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Mr. Rogers in a bloodstained sweater");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This is the ultimate showdown of ultimate destiny");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Good guys, bad guys, and explosions as far as the eye can see");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("And only one will survive, I wonder who it will be");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This is the ultimate showdown");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(The ultimate showdown)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This is the ultimate showdown");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(The ultimate showdown)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This is the ultimate showdown");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Of ultimate destiny\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Also, you should download TempleOS.\n");
        System.out.println("With that, the messenger takes the completed symbol from the door, tosses it away, shoves you back inside the room, and slams the door shut.");
        System.out.println("Understandably, you are befuddled, addled, bewildered, muddled, disoriented, baffled, perplexed, confused, dazed, mystified, confounded, and one might even say, if they were feeling especially bold and innovative, desperate to invent new ways of wordsmithing, which, upon further reflection, is not actually all that new: utterly clueless about what was just happened, so much so that you don't even get upset at once more being trapped - instead, you just sit on the floor, re-thinking your entire futile existence which has been flipped every direction you could possibly think of by this turn of events.");

        System.out.println("\n(Process finished with exit code 0)");

        escaped = true;
    }
}
