package by.pvt.dataeight;

public class Lion extends Animals {
    private String name;
    private String breed;
    private int weight;
    private int id;

    public Lion(String name, String breed, int weight, String color, int maxLife, String typeOfEat) {
        super( color, maxLife, typeOfEat);
        id = 0;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void rychyat() {
        System.out.println(getName() + " рычит");
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
        rychyat();
    }
    public void play() {
        igrat();
    }
}
