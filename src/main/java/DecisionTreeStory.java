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
                rollRequired = 5; // Example: Requires a roll of 10 to beat
            } else if (randomValue < 0.8333) {
                // 33.33% chance: Rare Monster
                System.out.println("From the shadows steps a seasoned killer...");
                System.out.println("It's a rare Black Rose enforcer, ruthless and cunning.");
                rollRequired = 10; // Example: Requires a roll of 15 to beat
            } else {
                // 16.66% chance: Boss Monster
                System.out.println("A chilling silence falls as the leader of the Black Rose appears...");
                System.out.println("It's the guildmaster, a deadly and masterful adversary.");
                rollRequired = 17; // Example: Requires a roll of 20 to beat
            }
        
            return rollRequired;
        }

        private static int generateMonsterAnomaly() {
            double chance = Math.random(); // Generate a random number between 0.0 and 1.0
            int rollRequired;

            if (chance < 0.5) { // 50% chance
                System.out.println("A mutant crawler emerges from the shadows! It's fast but weak.");
                rollRequired = 5; // Roll required to beat Monster A
            } else if (chance < 0.8333) { // 33.33% chance
                System.out.println("An enhanced enforcer bursts through the wall! Strong and relentless.");
                rollRequired = 10; // Roll required to beat Monster B
            } else { // 16.66% chance
                System.out.println("A towering monstrosity looms above! An experiment gone horribly wrong.");
                rollRequired = 17; // Roll required to beat Monster C
            }

            return rollRequired;
        }

        private static int generateMonsterBrigand() {
            double chance = Math.random(); // Generate a random number between 0.0 and 1.0
            int rollRequired;

            if (chance < 0.5) { // 50% chance
                System.out.println("Its just a kid looking for some money.");
                rollRequired = 5; // Roll required to beat Monster A
            } else if (chance < 0.8333) { // 33.33% chance
                System.out.println("An absolute hunk of a man emerges from the shadows attempting to steal your artillery.");
                rollRequired = 10; // Roll required to beat Monster B
            } else { // 16.66% chance
                System.out.println("The enemey has come back, seeking vengeance in the form of a skilled Zaun gang member.");
                rollRequired = 17; // Roll required to beat Monster C
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

            printDramaticText("Choose a buff (advantage/guidance/none): ");
            String buff = scanner.nextLine();
            
            Player player = new Player("example");
            int result = player.roll(buff);
            printDramaticText("Final roll result: " + result);
            
                if (result == 20) {
                    printDramaticText("CRITICAL SUCCESS. You have defeated the enemy!");
                    printDramaticText("Coming home from this military victory, you realize some brigands are following you.");
                    printDramaticText("What will you do?");
                    System.out.println("1. Beat them up.");
                    System.out.println("2. Run away.");
                    printDramaticText("Enter your choice (1 or 2): ");

                    int subChoicebis = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (subChoicebis == 1) {
                        printDramaticText("You turn around to uncover your assailant with a valiant look in your eye.");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }

                    if (subChoicebis == 2) {
                        printDramaticText("You turn to run away but your assailant quickly catches up to you...");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds.");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }

                } else if (result == 1) {
                    printDramaticText("CRITICAL FAILURE. The enemy immediately strikes you down with one fateful blow. You never stood a chance...");
                    printDramaticText("You die in agonizing circumstances!");
                } else if (result >= rollRequired) {
                    printDramaticText("Success!");
                    printDramaticText("Coming home from this military victory, you realize some brigands are following you.");
                    printDramaticText("What will you do?");
                    System.out.println("1. Beat them up.");
                    System.out.println("2. Run away.");
                    printDramaticText("Enter your choice (1 or 2): ");

                    int subChoicebis = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (subChoicebis == 1) {
                        printDramaticText("You turn around to uncover your assailant with a valiant look in your eye.");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }

                    if (subChoicebis == 2) {
                        printDramaticText("You turn to run away but your assailant quickly catches up to you...");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds.");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }
                } else {
                    printDramaticText("After a long, but ultimately decisive brawl, the enemy overpowers you. Better luck next time!");
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
            
                if (result == 20) {
                    printDramaticText("CRITICAL SUCCESS. You have defeated the enemy!");
                    printDramaticText("Coming home from this military victory, you realize some brigands are following you.");
                    printDramaticText("What will you do?");
                    System.out.println("1. Beat them up.");
                    System.out.println("2. Run away.");
                    printDramaticText("Enter your choice (1 or 2): ");

                    int subChoicebis = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (subChoicebis == 1) {
                        printDramaticText("You turn around to uncover your assailant with a valiant look in your eye.");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }

                    if (subChoicebis == 2) {
                        printDramaticText("You turn to run away but your assailant quickly catches up to you...");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds.");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }
                } else if (result == 1){
                    printDramaticText("CRITICAL FAILURE. The enemy immediately strikes you down with one fateful blow. You never stood a chance...");
                    printDramaticText("You die in agonizing circumstances!");
                } else if (result >= rollRequired) {
                    printDramaticText("Success!");
                    printDramaticText("Coming home from this military victory, you realize some brigands are following you.");
                    printDramaticText("What will you do?");
                    System.out.println("1. Beat them up.");
                    System.out.println("2. Run away.");
                    printDramaticText("Enter your choice (1 or 2): ");

                    int subChoicebis = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (subChoicebis == 1) {
                        printDramaticText("You turn around to uncover your assailant with a valiant look in your eye.");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }

                    if (subChoicebis == 2) {
                        printDramaticText("You turn to run away but your assailant quickly catches up to you...");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds.");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }
                } else {
                    printDramaticText("After a long, but ultimately decisive brawl, the enemy overpowers you. Better luck next time!");
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

                if (result == 20) {
                    printDramaticText("CRITICAL SUCCESS. You have defeated the enemy!");
                    printDramaticText("Coming home from this military victory, you realize some brigands are following you.");
                    printDramaticText("What will you do?");
                    System.out.println("1. Beat them up.");
                    System.out.println("2. Run away.");
                    printDramaticText("Enter your choice (1 or 2): ");

                    int subChoicebis = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (subChoicebis == 1) {
                        printDramaticText("You turn around to uncover your assailant with a valiant look in your eye.");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }

                    if (subChoicebis == 2) {
                        printDramaticText("You turn to run away but your assailant quickly catches up to you...");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds.");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }
                    
                } else if (result == 1) {
                    printDramaticText("CRITICAL FAILURE. The enemy immediately strikes you down with one fateful blow. You never stood a chance...");
                    printDramaticText("You die in agonizing circumstances!");
                } else if (result >= rollRequired) {
                    printDramaticText("Success!");
                    printDramaticText("Coming home from this military victory, you realize some brigands are following you.");
                    printDramaticText("What will you do?");
                    System.out.println("1. Beat them up.");
                    System.out.println("2. Run away.");
                    printDramaticText("Enter your choice (1 or 2): ");

                    int subChoicebis = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (subChoicebis == 1) {
                        printDramaticText("You turn around to uncover your assailant with a valiant look in your eye.");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }

                    if (subChoicebis == 2) {
                        printDramaticText("You turn to run away but your assailant quickly catches up to you...");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds.");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }
                } else {
                    printDramaticText("After a long, but ultimately decisive brawl, the enemy overpowers you. Better luck next time!");
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

                if (result == 20) {
                    printDramaticText("CRITICAL SUCCESS. You have defeated the enemy!");
                    printDramaticText("Coming home from this military victory, you realize some brigands are following you.");
                    printDramaticText("What will you do?");
                    System.out.println("1. Beat them up.");
                    System.out.println("2. Run away.");
                    printDramaticText("Enter your choice (1 or 2): ");

                    int subChoicebis = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (subChoicebis == 1) {
                        printDramaticText("You turn around to uncover your assailant with a valiant look in your eye.");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }

                    if (subChoicebis == 2) {
                        printDramaticText("You turn to run away but your assailant quickly catches up to you...");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds.");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }
                        
                } else if (result == 1) {
                    printDramaticText("CRITICAL FAILURE. The enemy immediately strikes you down with one fateful blow. You never stood a chance...");
                    printDramaticText("You die in agonizing circumstances!");
                } else if (result >= rollRequired) {
                    printDramaticText("Success!");
                    printDramaticText("Coming home from this military victory, you realize some brigands are following you.");
                    printDramaticText("What will you do?");
                    System.out.println("1. Beat them up.");
                    System.out.println("2. Run away.");
                    printDramaticText("Enter your choice (1 or 2): ");

                    int subChoicebis = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (subChoicebis == 1) {
                        printDramaticText("You turn around to uncover your assailant with a valiant look in your eye.");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }

                    if (subChoicebis == 2) {
                        printDramaticText("You turn to run away but your assailant quickly catches up to you...");

                        int rollRequiredBrigand = generateMonsterBrigand(); 
                        printDramaticText("You need to roll at least " + rollRequiredBrigand + " to defeat this enemy.");

                        printDramaticText("Choose a buff (advantage/guidance/none): ");
                        String buffbrigand = scanner.nextLine();
        
                        int resultb1= player.roll(buffbrigand);
                        printDramaticText("Final roll result: " + resultb1);

                            if (resultb1 == 20) {
                                printDramaticText("CRITICAL SUCCESS. You return home unscathed and ready for a new day!");
                                printDramaticText("Thank you for playing!");
                            } else if (resultb1 == 1 ) {
                                printDramaticText("CRITICAL FAILURE. The brigand strikes you down in one blow. You never make it home.");
                            } else if (resultb1 >= rollRequiredBrigand){
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion. You, however, emerge victorious!");
                                printDramaticText("You return home unscathed and ready for a new day!");
                            } else {
                                printDramaticText("Tumultuous brawl leads the both of you to exhaustion.");
                                printDramaticText("In the end, however, the brigand emerges victorious.");
                                printDramaticText("He leaves you in the street, alone, licking your wounds.");
                                printDramaticText("This encounter leaves you wondering why you would ever partake in such a treaterous endeavor.");
                            }

                    }
                } else {
                    printDramaticText("After a long, but ultimately decisive brawl, the enemy overpowers you. Better luck next time!");
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


