import java.util.Random;

public class Player {
    public String name;
    public String job;
    public int level;
    
    public int constitution;
    public int dexterity;
    public int strength;
    public int charisma;
    public int wisdom;
    public int intelligence;

    public Player(String name) {
        this.name = name;
        this.job = "enforcer";

        this.level = 1;
        int[] stats = new int[]{15, 14, 13, 12, 10, 8};
        shuffle(stats);

        this.strength = stats[0];
        this.constitution = stats[1];
        this.dexterity = stats[2];
        this.charisma = stats[3];
        this.wisdom = stats[4];
        this.intelligence = stats[5];
    }
    

    public void printCharacterSheet() {
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.job);
        System.out.println("Level: " + this.level);
        
        System.out.println("_________________");
        
        System.out.println("Strength: " + this.strength);
        System.out.println("Dexterity: " + this.dexterity);
        System.out.println("Constitution: " + this.constitution);
        System.out.println("Charisma: " + this.charisma);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("Wisdom: " + this.wisdom);
    }

    // https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
    private void shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            
            // Swap elements
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
    public int roll(String buff) {
        Random random = new Random();
        if(buff.toLowerCase().equals("a")) {
            // Roll first die
            int first = random.nextInt(20) + 1;
            Ascii.drawD20(first);

            int second = random.nextInt(20) + 1;
            Ascii.drawD20(second);

            

        }
        
        int roll = random.nextInt(20) + 1; 
        Ascii.drawD20(roll);

        // Generate dice graphic
        String[] symbols = {"-", "/", "\\", "|"};
        StringBuilder diceGraphic = new StringBuilder("|");
        for (int i = 0; i < 20; i++) {
            diceGraphic.append(symbols[random.nextInt(symbols.length)]);
        }
        diceGraphic.append("|");
        System.out.println("Dice graphic: " + diceGraphic);

        if ("advantage".equalsIgnoreCase(buff)) {
            int secondRoll = random.nextInt(20) + 1;
            System.out.println("Advantage roll! First roll: " + roll + ", Second roll: " + secondRoll);
            roll = Math.max(roll, secondRoll);
        } else if ("disadvantage".equalsIgnoreCase(buff)) {
            int secondRoll = random.nextInt(20) + 1;
            System.out.println("Disadvantage roll! First roll: " + roll + ", Second roll: " + secondRoll);
            roll = Math.min(roll, secondRoll);
        }

        // Print final result
        System.out.println("Final roll: 🎲 " + roll);
        return roll;
    }
}
 