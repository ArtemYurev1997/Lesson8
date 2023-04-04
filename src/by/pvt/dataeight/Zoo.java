package by.pvt.dataeight;

import java.util.Arrays;

public class Zoo {
    private Dog[] dogs = new Dog[0];
    private Bird[] birds = new Bird[0];
    private Lion[] lions = new Lion[0];

    static Animals[] initialize() {
        Animals[] animals = new Animals[9];
        Dog dog1 = new Dog("Rex", "Ovcarka", 12, "Green", 15, "Meat");
        Dog dog2 = new Dog("Kelly", "Ovcarka", 10, "Yellow", 15, "Meat");
        Dog dog3 = new Dog("Pork", "Ovcarka", 13, "Red", 15, "Meat");
        Bird bird1 = new Bird("Vorobey", 1000, "Grey", 8, "bread");
        Bird bird2 = new Bird("Solovei", 800, "Grey", 9, "bread");
        Bird bird3 = new Bird("Orel", 1300, "Grey", 12, "mouse");
        Lion lion1 = new Lion("Roccy", "Man", 130, "Orange", 20, "Meat");
        Lion lion2 = new Lion("Tim", "Man", 134, "Yellow", 20, "Meat");
        Lion lion3 = new Lion("Nicky", "Woman", 100, "Orange", 20, "Meat");
            animals[0] = dog1;
            animals[1] = dog2;
            animals[2] = dog3;
            animals[3] = bird1;
            animals[4] = bird2;
            animals[5] = bird3;
            animals[6] = lion1;
            animals[7] = lion2;
            animals[8] = lion3;

            return animals;
    }

    public Zoo(Dog[] dogs, Bird[] birds, Lion[] lions) {
        this.dogs = dogs;
        this.birds = birds;
        this.lions = lions;
    }

    public Zoo() {
    }

    public int getNumAllAnimals() {
        return lions.length + birds.length + dogs.length;
    }

    public Bird[] getBirds() {
        return birds;
    }

    public void setBirds(Bird[] birds) {
        this.birds = birds;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    public Lion[] getLions() {
        return lions;
    }

    public void setLions(Lion[] lions) {
        this.lions = lions;
    }

    public String toString() {
        return Arrays.toString(getDogs())+ "; " + Arrays.toString(getBirds()) + "; " + Arrays.toString(getLions());
    }

    public void getDogsZoo(Dog dog) {
        int numOfLength = dogs.length;
        if(numOfLength == 0) {
            dogs = new Dog[1];
            dogs[0] = dog;
        }
        else {
            Dog[] copyDogs = new Dog[dogs.length];
            for(int i =0; i < dogs.length; i++) {
                if(i != dogs.length) {
                    copyDogs[i] = dogs[i];
                }
                else {
                    copyDogs[i] = dog;
                }
            }
            dogs = copyDogs;
        }
        System.out.println("id:" + dog.getId() + " " + Arrays.toString(dogs));
    }

    public void getBirdsZoo(Bird bird) {
        int numOfLength = birds.length;
        if(numOfLength == 0) {
            birds = new Bird[1];
            birds[0] = bird;
        }
        else {
            Bird[] copyBirds = new Bird[birds.length];
            for(int i =0; i < birds.length; i++) {
                if(i != birds.length) {
                    copyBirds[i] = birds[i];
                }
                else {
                    copyBirds[i] = bird;
                }
            }
            birds = copyBirds;
        }
        System.out.println("id:" + bird.getId() + " " + Arrays.toString(birds));
    }

    public void getLionsZoo(Lion lion) {
        int numOfLength = lions.length;
        if(numOfLength == 0) {
            lions = new Lion[1];
            lions[0] = lion;
        }
        else {
            Lion[] copyLions = new Lion[lions.length];
            for(int i =0; i < lions.length; i++) {
                if(i != lions.length) {
                    copyLions[i] = lions[i];
                }
                else {
                    copyLions[i] = lion;
                }
            }
            lions = copyLions;
        }
        System.out.println("id:" + lion.getId() + " " + Arrays.toString(lions));
    }

    public static Animals[] removeAnimal(Animals[] animals, int index)  {
        Animals[] result = new Animals[animals.length - 1];
        for(var i = 0; i < animals.length; i++) {
            if(i != index) {
                var newIndex = i < index ? i : i - 1;
                result[newIndex] = animals[i];
            }
        }
        System.out.println("Теперь количество животных стало: " + result.length);
        return result;
    }

    /*public void callSound() {
        for (Animals dog : dogs) {
            dog.sound();
        }
        for (Animals bird : birds) {
            bird.sound();
        }
        for (Animals lion : lions) {
            lion.sound();
        }
    }*/

}
