package Practice.OOP.PolyMorphisim.Animal;

public class Cat extends Animal {
    @Override
    public void sound(String volume) {
        System.out.println("The cat meows " + volume);
    }
}
