package circus;

<<<<<<< Updated upstream
import circus.stuff.Equipment;
import circus.stuff.Cannon;
import circus.stuff.Ladder;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.animal.Tiger;

=======
import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;
>>>>>>> Stashed changes

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Number of animals: " + animals.length);

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        System.out.println("Number of animals in circus (AL): " + animalArrayList.size());
        animalArrayList.add(new Elephant(name:"Strong One"));
        printAllAnimals(animalArrayList);
        printNumberofAnimals(animalArrayList);

        animalArrayList.add(new Duck(name:"Andy"));
        Tiger sherKhan = new Tiger(name:"Sher Khan");
        animalArrayList.add(sherKhan);
        Parrot bobby = new Parrot(name:"bobby");
        animalArrayList.add(bobby);

        System.out.println();

        makeAnimalsTalk();
        System.out.println("Total value of animals " + calculateAssetValue(animals));
        System.out.println("Total value of equipments " + calculateAssetValue(equipments));
    }

    private static void printAllAnimals(@NotNull ArrayList<Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    private static void printNumberofAnimals(@NotNull ArrayList<Animal> animals){
        System.out.println("Number of animals in circus: " + animals.size());
    }


}
