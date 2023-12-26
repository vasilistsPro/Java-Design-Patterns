// Υλοποίηση της κλάσης Car για τα αυτοκίνητα Ford
class Ford extends Car {
    Ford() {
        super("Ford");
    }

    @Override
    void start() {
        System.out.println("Ford is starting...");
    }

    @Override
    void stop() {
        System.out.println("Ford is stopping...");
    }

    @Override
    void turn() {
        System.out.println("Ford is turning...");
    }
}