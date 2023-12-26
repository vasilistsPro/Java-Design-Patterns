// Βασική κλάση για τα αυτοκίνητα
class Car {
    private String brand;
    private String startMessage;
    private String stopMessage;
    private String turnMessage;

    Car(String brand, String startMessage, String stopMessage, String turnMessage) {
        this.brand = brand;
        this.startMessage = startMessage;
        this.stopMessage = stopMessage;
        this.turnMessage = turnMessage;
    }

    String getBrand() {
        return brand;
    }

    void start() {
        System.out.println(startMessage);
    }

    void stop() {
        System.out.println(stopMessage);
    }

    void turn() {
        System.out.println(turnMessage);
    }

    static class CarBuilder {
        private String brand;
        private String startMessage;
        private String stopMessage;
        private String turnMessage;

        CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        CarBuilder setStartMessage(String startMessage) {
            this.startMessage = startMessage;
            return this;
        }

        CarBuilder setStopMessage(String stopMessage) {
            this.stopMessage = stopMessage;
            return this;
        }

        CarBuilder setTurnMessage(String turnMessage) {
            this.turnMessage = turnMessage;
            return this;
        }

        Car build() {
            return new Car(brand, startMessage, stopMessage, turnMessage);
        }
    }
}
