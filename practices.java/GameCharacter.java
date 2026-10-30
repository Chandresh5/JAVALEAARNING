public class GameCharacter {
    public static void main(String[] mk) {
        int[] startingItems = {10, 20, 30};
        
        // Ab class ka naam GameCharacter hai
        GameCharacter c1 = new GameCharacter("firefire", 100, startingItems);
        c1.display();
        
        // Deep copy constructor call
        GameCharacter c2 = new GameCharacter(c1);
        
        // Original c1 ka pehla item change karte hain (Deep copy check karne ke liye)
        c1.inventory[0] = 999;
        
        System.out.println("\n--- After changing c1 inventory ---");
        System.out.print("c1 -> ");
        c1.display();
        
        System.out.print("c2 -> ");
        c2.display(); // c2 ka pehla item abhi bhi 10 hi rehna chahiye!
    }

    String name;
    int level;
    int[] inventory; // Array type
    
    // Parameterized Constructor (Naam class se match hona chahiye)
    GameCharacter(String name, int level, int[] inventory) {
        this.name = name;
        this.level = level;
        this.inventory = inventory;
    }
    
    // Deep Copy Constructor (Naam class se match hona chahiye)
    GameCharacter(GameCharacter other) {
        this.name = other.name;
        this.level = other.level;
        
        // DEEP COPY: Naya array allocate karke values copy kar rahe hain
        this.inventory = new int[other.inventory.length];
        for(int i = 0; i < other.inventory.length; i++) {
            this.inventory[i] = other.inventory[i];
        }
    }
    
    void display() {
        System.out.println("Name: " + name + ", Level: " + level + ", Inventory: [" + inventory[0] + ", " + inventory[1] + ", " + inventory[2] + "]");
    }
}