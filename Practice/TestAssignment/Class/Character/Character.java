package Character;

public class Character {
    private String name;
    private int health;
    private int strength;

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        if(name == null || name.isEmpty()) {
            name = "Unknown";
        }
        return name;
    }
    public int getHealth() {
        if(health < 0) {
            System.out.println("Health cannot be negative. Setting health to 0.");
            health = 0;
        }
        if(health > 100) {
            System.out.println("Health cannot exceed 100. Setting health to 100.");
            health = 100;
        }
        return health;
    }
    public int getStrength(){
        if(strength < 0) {
            System.out.println("Strength cannot be negative. Setting strength to 0.");
            strength = 0;
        }
        if(strength > 100) {
            System.out.println("Strength cannot exceed 100. Setting strength to 100.");
            strength = 100;
        }
        return strength;
    }

    public void attack(Character target){
        System.out.println(this.name + " attacks " + target.getName() + " for " + this.strength + " damage.");
        target.health -= this.strength;
        if(target.health < 0) {
            target.health = 0;
        }
    }
    public void heal(int amount){
        System.out.println(this.name + " heals for " + amount + " health.");
        this.health += amount;
        if(this.health > 100) {
            this.health = 100;
        }
    }
    public boolean isAlive(){
        return this.health > 0;
    }
}
