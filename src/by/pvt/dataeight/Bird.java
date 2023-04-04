package by.pvt.dataeight;

public class Bird extends Animals {
    private String family;
    private int maxHeight;
    private int id;

    public Bird(String family, int maxHeight, String color, int maxLife, String typeOfEat) {
        super(color, maxLife, typeOfEat);
        id = 0;
        this.family = family;
        this.maxHeight = maxHeight;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void pet() {
        System.out.println(getFamily() + " поёт");
    }
    public void klevat() {
        System.out.println(getFamily() + " клюёт");
    }
    public void vysizhivat() {
        System.out.println(getFamily() + " высиживает");
    }

    public String toString() {

        return "Семейство: " + family + " " + "Максимальная высота полета: " + maxHeight + " " + super.toString();
    }

    public void sound() {
        pet();
    }
    public void play() {
        System.out.println(getFamily() + " играет");
    }

}
