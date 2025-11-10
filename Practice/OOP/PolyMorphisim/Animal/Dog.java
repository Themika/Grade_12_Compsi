package Practice.OOP.PolyMorphisim.Animal;

public class Dog extends Animal {
    @Override
    public void sound(String volume) {
        System.out.println("The dog barks " + volume);
    }
}
