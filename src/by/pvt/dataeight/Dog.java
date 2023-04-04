package by.pvt.dataeight;

public class Dog extends Animals {
    private String name;
    private String breed;
    private int weight;
    private int id;

    public Dog(String name, String breed, int weight, String color, int maxLife, String typeOfEat) {
        super( color, maxLife, typeOfEat);
        id = 0;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }


    public void setId() {
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }

    public void layat() {
        System.out.println(getName() + " лает");
    }
    public void kusat() {
        System.out.println(getName() +" кусает");
    }
    public void begat() {
        System.out.println(getName() + " бегает");
    }
    public void igrat() {
        System.out.println(getName() + " играет");
    }
    public void prygat() {
        System.out.println(getName() + " прыгает");
    }

    public String toString() {

        return "Имя: " + name + "  " + "Порода: " + breed + "  " + "Масса: " + weight + "  " + super.toString();
    }

    public void sound() {
        layat();
    }
    public void play() {
        igrat();
    }
}
