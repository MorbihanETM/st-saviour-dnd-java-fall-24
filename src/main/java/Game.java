import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) {

        // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);

    
        

        printDramaticText("Choose one of the following roles for your adventure:");
        printDramaticText("1. Enforcer");
        printDramaticText("2. Inventor");

        System.out.println(" ");

        String job = scanner.nextLine();
        // TODO Create Tav instance with user input.

        
        printDramaticText("You wake up at the Vyx, a known harem on the outskirts of Zaun. Who even are you?");

        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        Player player = new Player(name, job);
        player.printCharacterSheet();

        Ascii.titlescreen();

        printDramaticText("Press Enter to begin the story...");
        scanner.nextLine();

        printDramaticText("Lest is asleep next to you. She's been distracted lately.");
        printDramaticText("Since the council had been attacked Piltover and Zaun have reached levels tension they had never experienced before.");
        printDramaticText("But you know that Lest hears all...  Wake her up to learn your mission.");
        System.out.println(   );
        printDramaticText("Roll for charisma");
        
        
        printDramaticText("Choose a buff (advantage/guidance/none): ");
        String buff = scanner.nextLine();
        int result = player.roll(buff);
        printDramaticText("Final roll result: " + result);

        // player.roll("advantage");

        printDramaticText("Lest reveals that there are two imminent threats to the sanctity of our twin cities:"); 
        printDramaticText("1. The Black Rose.");
        printDramaticText("2. The Anomaly.");
        printDramaticText("Choose 1 or 2 for combat");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            DecisionTreeStory.blackRoseStory(scanner);
        } else if (choice == 2) {
            DecisionTreeStory.anomalyStory(scanner);
        } else {
            System.out.println("Invalid choice. The story ends here.");
        }
        scanner.close();

        
        



        

        

        


        

        System.out.println();
        // TODO Implement generateMonster()
        // TODO Collect buffs from user.
        // TODO Implement roll() method for Tav.
        // TODO Print Critical Success & Critical Failure.
        // TODO Check for 3 successful monster encounters.
        // TODO Print GAME OVER or winning message. 
        
    }

    public static void printDramaticText(String text) {
        // Delay in milliseconds
        int delay = 100;

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
