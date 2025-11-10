package Practice.OOP.PolyMorphisim.Animal;

public class Bird extends Animal {
    @Override
    public void sound(String volume) {
        System.out.println("The bird chirps " + volume);
    }
}
