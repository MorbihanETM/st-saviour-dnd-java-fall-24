import java.util.Scanner;
import java.util.concurrent.TimeUnit;

    public class DecisionTreeStory {
        
        private static int generateMonsterBlackRose() {
            double randomValue = Math.random(); // Generate a random number between 0.0 and 1.0
            int rollRequired;
        
            if (randomValue < 0.5) {
                // 50% chance: Common Monster
                System.out.println("A shadowy figure emerges from the darkness...");
                System.out.println("It's a common Black Rose assassin, agile but predictable.");
                rollRequired = 10; // Example: Requires a roll of 10 to beat
            } else if (randomValue < 0.8333) {
                // 33.33% chance: Rare Monster
                System.out.println("From the shadows steps a seasoned killer...");
                System.out.println("It's a rare Black Rose enforcer, ruthless and cunning.");
                rollRequired = 15; // Example: Requires a roll of 15 to beat
            } else {
                // 16.66% chance: Boss Monster
                System.out.println("A chilling silence falls as the leader of the Black Rose appears...");
                System.out.println("It's the guildmaster, a deadly and masterful adversary.");
                rollRequired = 20; // Example: Requires a roll of 20 to beat
            }
        
            return rollRequired;
        }
        
        
        
        public static void blackRoseStory(Scanner scanner){
        printDramaticText("You have chosen to face The Black Rose.");
        
        printDramaticText("The Black Rose is a shadowy assassin guild with deep ties to the underworld.");
        printDramaticText("What will you do?");
        System.out.println("1. Infiltrate their headquarters.");
        System.out.println("2. Set up an ambush to capture their leader.");
        printDramaticText("Enter your choice (1 or 2): ");

        int subChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (subChoice == 1) {
            printDramaticText("You sneak into their lair under the cover of darkness...");
            printDramaticText("Suddenly, a figure appears before you!");
            
            int rollRequired = generateMonsterBlackRose();
            printDramaticText("You need to roll at least " + rollRequired + " to defeat this enemy.");

            printDramaticText("Press Enter to roll the dice...");
            scanner.nextLine();
            int playerRoll = (int) (Math.random() * 20) + 1; // Roll a 20-sided die
            printDramaticText("You rolled a " + playerRoll + "!");
            
                if (playerRoll >= rollRequired) {
                    printDramaticText("You have defeated the enemy!");
                } else {
                    printDramaticText("The enemy overpowers you... The story ends here.");
                }
    
        }

        else if (subChoice == 2) {
            printDramaticText("You set a cunning trap for their leader...");
            printDramaticText("The plan succeeds, and you face the leader in an intense duel!");
            // Add more story progression here
        } else {
            System.out.println("Invalid choice. The Black Rose overwhelms you. The story ends.");
        }
    }
    public static void anomalyStory(Scanner scanner) {
        System.out.println("You have chosen to face The Anomaly.");
        System.out.println("The Anomaly is a mysterious force that warps reality itself.");
        System.out.println("What will you do?");
        System.out.println("1. Research the anomaly's origins in ancient texts.");
        System.out.println("2. Confront the anomaly directly in its lair.");
        System.out.print("Enter your choice (1 or 2): ");
        
        int subChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        if (subChoice == 1) {
            System.out.println("You delve into dusty tomes, uncovering forbidden knowledge...");
            System.out.println("The research takes a toll on your sanity, but you gain valuable insights.");
            // Add more story progression here
        } else if (subChoice == 2) {
            System.out.println("You step into the anomaly's lair, where reality bends and twists...");
            System.out.println("The anomaly manifests as a shadowy figure, and you prepare for battle.");
            // Add more story progression here
        } else {
            System.out.println("Invalid choice. The anomaly consumes you. The story ends.");
        }
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


