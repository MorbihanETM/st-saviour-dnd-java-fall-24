import java.util.Random;
import java.util.Scanner;

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

    public Player(String name, String job) {
        this.name = name;
        this.job = job;

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
        
        int d20Roll = rollD20();

        switch (buff.toLowerCase()) {
            case "advantage":
                int secondD20Roll = rollD20();
                System.out.println("First d20 roll: " + d20Roll);
                System.out.println("Second d20 roll: " + secondD20Roll);
                return Math.max(d20Roll, secondD20Roll);

            case "guidance":
                int d4Roll = rollD4();
                System.out.println("d20 roll: " + d20Roll);
                System.out.println("d4 roll: " + d4Roll);
                return d20Roll + d4Roll;

            default:
                System.out.println("d20 roll: " + d20Roll);
                return d20Roll;
        }
    }

    public int rollD20() {
        return (int) (Math.random() * 20) + 1;
    }
    
        // Roll a d4
    public int rollD4() {
        return (int) (Math.random() * 4) + 1;
    }
}

 