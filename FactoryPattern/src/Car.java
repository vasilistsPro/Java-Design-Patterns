// Βασική κλάση για τα αυτοκίνητα
abstract class Car {
    private String brand;

    Car(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    abstract void start();

    abstract void stop();

    abstract void turn();
}