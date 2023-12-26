// Κύρια κλάση που χρησιμοποιεί το Factory Pattern
public class Main {
    public static void main(String[] args) {
        // Factory Pattern
        CarFactory suzukiFactory = new SuzukiFactory();
        Car suzukiCar = suzukiFactory.createCar();
        System.out.println("Car: " + suzukiCar.getBrand());
        suzukiCar.start();
        suzukiCar.turn();
        suzukiCar.stop();

        CarFactory fordFactory = new FordFactory();
        Car fordCar = fordFactory.createCar();
        System.out.println("Car: " + fordCar.getBrand());
        fordCar.start();
        fordCar.turn();
        fordCar.stop();
    }
}