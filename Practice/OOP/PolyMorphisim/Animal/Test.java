package Practice.OOP.PolyMorphisim.Animal;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myBird = new Bird();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(myDog);
        animals.add(myCat);
        animals.add(myBird);
        for (Animal animal : animals) {
            System.out.print("The "+animal.getClass().getSimpleName() + " says: ");
            animal.sound("loudly");
        }
    }
}
