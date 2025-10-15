package Character;

public class Demo {
    public static void main(String[] args) {
        Character hero = new Character("Aragorn", 100, 80);
        Character villain = new Character("Orc", 70, 50);
        
        System.out.println("Hero: " + hero.getName() + ", Health: " + hero.getHealth() + ", Strength: " + hero.getStrength());
        System.out.println("Villain: " + villain.getName() + ", Health: " + villain.getHealth() + ", Strength: " + villain.getStrength());
        
        hero.attack(villain);
        System.out.println("Villain's Health after attack: " + villain.getHealth());
        
        villain.attack(hero);
        System.out.println("Hero's Health after attack: " + hero.getHealth());
        
        hero.heal(20);
        System.out.println("Hero's Health after healing: " + hero.getHealth());
        
        System.out.println("Is Hero alive? " + hero.isAlive());
        System.out.println("Is Villain alive? " + villain.isAlive());
    }
    
}
