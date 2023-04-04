package by.pvt.dataeight;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {

        //1.3
        Zoo zoo1 = new Zoo(new Dog[]{new Dog("Rex", "Ovcarka", 12, "Green", 15, "Meat"), new Dog("Kelly", "Ovcarka", 10, "Yellow", 15, "Meat"), new Dog("Pork", "Ovcarka", 13, "Red", 15, "Meat")},
                new Bird[]{new Bird("Vorobey", 1000, "Grey", 8, "bread"), new Bird("Solovei", 800, "Grey", 9, "bread"), new Bird("Orel", 1300, "Grey", 12, "mouse")},
                new Lion[]{new Lion("Roccy", "Man", 130, "Orange", 20, "Meat"), new Lion("Tim", "Man", 134, "Yellow", 20, "Meat"), new Lion("Nicky", "Woman", 100, "Orange", 20, "Meat")});
        System.out.println(zoo1); //1.8
        System.out.println("Всего животных в зоопарке: " + zoo1.getNumAllAnimals()); //1.6
        System.out.println();
        //1.4
        Zoo zoopark = new Zoo();
        Dog dog1 = new Dog("Rex", "Ovcarka", 12, "Green", 15, "Meat");
        Bird bird1 = new Bird("Vorobey", 1000, "Grey", 8, "bread");
        Lion lion1 = new Lion("Roccy", "Man", 130, "Orange", 20, "Meat");
        Zoo zoopark2 = new Zoo();
        Dog dog2 = new Dog("Kelly", "Ovcarka", 10, "Yellow", 15, "Meat");
        Bird bird2 = new Bird("Solovei", 800, "Grey", 9, "bread");
        Lion lion2 = new Lion("Tim", "Man", 134, "Yellow", 20, "Meat");
        Zoo zoopark3 = new Zoo();
        Dog dog3 = new Dog("Pork", "Ovcarka", 13, "Red", 15, "Meat");
        Bird bird3 = new Bird("Orel", 1300, "Grey", 12, "mouse");
        Lion lion3 = new Lion("Nicky", "Woman", 100, "Orange", 20, "Meat");

        dog1.setId(); //1.7
        zoopark.getDogsZoo(dog1);
        dog2.setId();
        zoopark2.getDogsZoo(dog2);
        dog3.setId();
        zoopark3.getDogsZoo(dog3);
        bird1.setId();
        zoopark.getBirdsZoo(bird1);
        bird2.setId();
        zoopark2.getBirdsZoo(bird2);
        bird3.setId();
        zoopark3.getBirdsZoo(bird3);
        lion1.setId();
        zoopark.getLionsZoo(lion1);
        lion2.setId();
        zoopark2.getLionsZoo(lion2);
        lion3.setId();
        zoopark3.getLionsZoo(lion3);
        System.out.println();
        //1.9
        Zoo zoo2 = new Zoo();
        System.out.println(Arrays.toString(zoo2.removeAnimal(Zoo.initialize(), 8)));


        System.out.println();
        //1.5 class Lion
        Dog dog = new Dog("Rex", "Ovcarka", 12, "Green", 15, "Meat");
        Bird bird = new Bird("Vorobey", 1000, "Grey", 8, "bread");
        Lion lion = new Lion("Roccy", "Man", 130, "Orange", 20, "Meat");
        dog.kusat();
        dog.layat();
        dog.igrat();
        bird.klevat();
        bird.pet();
        System.out.println(dog);
        System.out.println(bird);
        System.out.println(lion);
        dog.sound();
        bird.play();
        lion.rychyat();
        lion.play();
    }



}
