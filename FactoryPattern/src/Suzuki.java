// Υλοποίηση της κλάσης Car για τα αυτοκίνητα Suzuki
class Suzuki extends Car {
    Suzuki() {
        super("Suzuki");
    }

    @Override
    void start() {
        System.out.println("Suzuki is starting...");
    }

    @Override
    void stop() {
        System.out.println("Suzuki is stopping...");
    }

    @Override
    void turn() {
        System.out.println("Suzuki is turning...");
    }
}
