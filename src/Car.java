public class Car {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private double engineVolume;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Марка " + this.brand + this.model + "\n" + "Год выпуска " + this.year + "\n" + "Сборка в " + this.country + "\n" + this.color + "  Цвет кузова " + "\n" + "Обьем двигателя " + this.engineVolume;
    }
}


