package circus;

<<<<<<< HEAD
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
=======
import circus.animal.*;
import circus.stuff.Cage;
>>>>>>> generics_cage
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;
>>>>>>> Stashed changes

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;

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

    private static void printAllAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
<<<<<<< HEAD
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
=======

        System.out.println("Number of animals: " + animals.length);
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        System.out.println("Number of animals: " + animalArrayList.size());
        animalArrayList.add(new Tiger("Sherkhan"));
        System.out.println("Number of animals: " + animalArrayList.size());

        animalArrayList.add(new Parrot());

        Duck louie = new Duck();
        animalArrayList.add(louie);
        Elephant strongOne = new Elephant("StrongOne");
        animalArrayList.add(strongOne);

        printAllAnimals(animalArrayList);

        Cage<Duck> duckCage = new Cage<>();
        Duck duck = new Duck();
        duckCage.lockUp(duck);
        Parrot parrot = new Parrot();
        Cage<Parrot> parrotCage = new Cage<>();
        parrotCage.lockUp(parrot);

        ArrayList<Cage> cages = new ArrayList<>();
        cages.add(duckCage);
        cages.add(parrotCage);

        for(Cage c: cages) {
            c.release();
        }
>>>>>>> generics_cage
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
