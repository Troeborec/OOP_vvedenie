public class Car {
    Car[] cars = new Car[5];
    String brand;
    String model;
    int year;
    String country;
    String color;
    double engineVolume;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "defult";
        } else this.brand = brand;
        if (model == null || model.isEmpty()) {
            this.model = "defult";
        } else this.model = model;

        if (year <= 0) {
            this.year = 2000;
        }
        this.year = year;
        this.country = country;
        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        }
        this.color = color;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;

        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {


        return "Марка " + this.brand + this.model + "\n" + "Год выпуска " + this.year + "\n" + "Сборка в " + this.country + "\n" + this.color + "  Цвет кузова " + "\n" + "Обьем двигателя " + this.engineVolume;
    }
}





