import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bear bear = new Bear("Yogi", 200, 40);
        Tiger tiger = new Tiger("Jataka", 150, 25);
        Wolf wolf = new Wolf("Howler", 70, 40);
        Dog dog = new Dog("Scooby", 30);


        List<Animal> animals = new ArrayList<>(Arrays.asList(bear, tiger, wolf, dog));
        for (Animal animal : animals)
            animal.introduce();


        List<Canine> howlers = new ArrayList<>(Arrays.asList(wolf, dog));
        for (Canine c : howlers) {
            System.out.print("My name is " + ((Animal)c).getName() + " and I am barking: ");
            c.bark();
            if (c instanceof Dog)
                ((Dog) c).sitPretty();
        }
    }
}

