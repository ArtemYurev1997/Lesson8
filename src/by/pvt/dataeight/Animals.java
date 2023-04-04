package by.pvt.dataeight;

public class Animals {
    private String color;
    private int maxLife;
    private String typeOfEat;
    static int nextId = 1;
    private int id;

    public Animals(String color, int maxLife, String typeOfEat) {
        id = 0;
        this.color = color;
        this.maxLife = maxLife;
        this.typeOfEat = typeOfEat;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public void setTypeOfEat(String typeOfEat) {
        this.typeOfEat = typeOfEat;
    }

    public String getColor() {
        return color;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public String getTypeOfEat() {
        return typeOfEat;
    }

    public void sound() {
        System.out.println("Животное издаёт звук");
    }
    public void play() {
        System.out.println("Животное играет");
    }
    public String toString() {
        return "Цвет: " + color + " " + "Максимальное количество жизни: " + maxLife + " " + "Тип еды: " + typeOfEat;
    }
}

