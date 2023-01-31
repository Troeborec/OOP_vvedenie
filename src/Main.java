public class Main {
    static Car[] cars = new Car[5];
    static int size = 0;

    public static void addCar(String brand, String model, int year, String country, String color, double engineVolume) {
        Car car = new Car(brand, model, year, country, color, engineVolume);
        cars[size++] = car;
    }

    public static void printCar() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

    public static void printPalka() {
        System.out.println("//////////////");
    }
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 2015, "Россия", "Желтый", 1.7);
        Car audiA8 = new Car("Audi", "A8", 2020, "Германия", "Черный", 3.0);
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германия", "Черный", 3.0);
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "Красный", 2.4);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 1.6);
      //printCar();
    }
}