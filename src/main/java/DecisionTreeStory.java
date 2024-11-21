import java.util.Scanner;

    public class DecisionTreeStory {
        public static void blackRoseStory(Scanner scanner) {
        System.out.println("You have chosen to face The Black Rose.");
        System.out.println("The Black Rose is a shadowy assassin guild with deep ties to the underworld.");
        System.out.println("What will you do?");
        System.out.println("1. Infiltrate their headquarters.");
        System.out.println("2. Set up an ambush to capture their leader.");
        System.out.print("Enter your choice (1 or 2): ");

        int subChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (subChoice == 1) {
            System.out.println("You sneak into their lair under the cover of darkness...");
            System.out.println("However, you are spotted by a guard. A fight ensues!");
            // Add more story progression here
        } else if (subChoice == 2) {
            System.out.println("You set a cunning trap for their leader...");
            System.out.println("The plan succeeds, and you face the leader in an intense duel!");
            // Add more story progression here
        } else {
            System.out.println("Invalid choice. The Black Rose overwhelms you. The story ends.");
        }
    }
        private static void anomalyStory(Scanner scanner) {
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
}


