// Κύρια κλάση που χρησιμοποιεί το Builder Pattern
public class Main {
    public static void main(String[] args) {
        // Builder Pattern
        Car suzuki = new Car.CarBuilder()
                .setBrand("Suzuki")
                .setStartMessage("Suzuki is starting...")
                .setStopMessage("Suzuki is stopping...")
                .setTurnMessage("Suzuki is turning...")
                .build();

        Car ford = new Car.CarBuilder()
                .setBrand("Ford")
                .setStartMessage("Ford is starting...")
                .setStopMessage("Ford is stopping...")
                .setTurnMessage("Ford is turning...")
                .build();

        // Χρήση των αυτοκινήτων
        System.out.println("Car: " + suzuki.getBrand());
        suzuki.start();
        suzuki.turn();
        suzuki.stop();

        System.out.println("Car: " + ford.getBrand());
        ford.start();
        ford.turn();
        ford.stop();
    }
}