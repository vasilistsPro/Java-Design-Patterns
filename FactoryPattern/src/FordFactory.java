// Υλοποίηση της διεπαφής για τη δημιουργία αυτοκινήτων Ford
class FordFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }
}