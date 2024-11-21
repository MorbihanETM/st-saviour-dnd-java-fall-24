import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) {

        // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);

        // Collect character name from user.
        System.out.print("Name: ");
        String name = scanner.nextLine();

        // TODO Create Tav instance with user input.

        printDramaticText("You wake up at the Vyx. Who even are you?");
        
        Player player = new Player(name);
        player.printCharacterSheet();

        printDramaticText("Lest is asleep next to you. Wake her up to learn your mission.");
        System.out.println(   );
        printDramaticText("Roll for charisma with advantage! ");

        player.roll("advantage");

        printDramaticText("Lest reveals that there are two threats to Piltover:"); 
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
