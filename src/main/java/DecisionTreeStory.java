import java.util.Random;
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

        private static int generateMonsterAnomaly() {
            double chance = Math.random(); // Generate a random number between 0.0 and 1.0

            if (chance < 0.5) { // 50% chance
                System.out.println("A mutant crawler emerges from the shadows! It's fast but weak.");
                return 5; // Roll required to beat Monster A
            } else if (chance < 0.8333) { // 33.33% chance
                System.out.println("An enhanced enforcer bursts through the wall! Strong and relentless.");
                return 10; // Roll required to beat Monster B
            } else { // 16.66% chance
                System.out.println("A towering monstrosity looms above! An experiment gone horribly wrong.");
                return 15; // Roll required to beat Monster C
            }
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

            printDramaticText("Choose a buff (advantage/guidance/none): ");
            String buff = scanner.nextLine();
            
            Player player = new Player("example");
            int result = player.roll(buff);
            printDramaticText("Final roll result: " + result);
            
                if (result >= rollRequired) {
                    printDramaticText("You have defeated the enemy!");
                } else {
                    printDramaticText("The enemy overpowers you... The story ends here.");
                }
    
        }

        else if (subChoice == 2) {
            printDramaticText("You set a cunning trap for their leader...");
            printDramaticText("Suddenly, a figure appears before you!");
            
            int rollRequired = generateMonsterBlackRose();
            printDramaticText("You need to roll at least " + rollRequired + " to defeat this enemy.");

            printDramaticText("Choose a buff (advantage/guidance/none): ");
            String buff = scanner.nextLine();
            
            Player player = new Player("example");
            int result = player.roll(buff);
            printDramaticText("Final roll result: " + result);
            
                if (result >= rollRequired) {
                    printDramaticText("The plan succeeds, and you face the leader in an intense duel!");
                    printDramaticText("After moments of violent battle, you defeat The Black Rose!");
                } else {
                    printDramaticText("The enemy overpowers you... The story ends here.");
                }
            
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
            

            int rollRequired = generateMonsterAnomaly();
            printDramaticText("You need to roll at least " + rollRequired + " to defeat this enemy.");
            
            printDramaticText("Choose a buff (advantage/guidance/none): ");
            String buff = scanner.nextLine();
            
            Player player = new Player("example");
            int result = player.roll(buff);
            printDramaticText("Final roll result: " + result);

                if (result >= rollRequired) {
                    printDramaticText("You have defeated the enemy!");
                    System.out.println("The research takes a toll on your sanity, but you gain valuable insights.");
                } else {
                    printDramaticText("After a long struggle, the enemy overpowers you... The story ends here.");
                }
        } else if (subChoice == 2) {
            System.out.println("You step into the anomaly's lair, where reality bends and twists...");
            
            int rollRequired = generateMonsterAnomaly();
            printDramaticText("You need to roll at least " + rollRequired + " to defeat this enemy.");
            
            printDramaticText("Choose a buff (advantage/guidance/none): ");
            String buff = scanner.nextLine();
            
            Player player = new Player("example");
            int result = player.roll(buff);
            printDramaticText("Final roll result: " + result);

                if (result >= rollRequired) {
                    printDramaticText("You have defeated the enemy!");
                    System.out.println("Having uncovered these creatured has changed you forever. Good luck though!");
                } else {
                    printDramaticText("After a long struggle, the enemy overpowers you... The story ends here.");
                }
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


