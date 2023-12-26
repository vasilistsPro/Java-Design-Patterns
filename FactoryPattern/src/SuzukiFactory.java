// Υλοποίηση της διεπαφής για τη δημιουργία αυτοκινήτων Suzuki
class SuzukiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Suzuki();
    }
}
