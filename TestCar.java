public class TestCar {
    public static void main(String[] args) {
        // Creating objects from the Car class
        Car car1 = new Car("Red", 60);   // Object 1
        Car car2 = new Car("Blue", 100); // Object 2

        // Display info for each object
        System.out.println("Car 1 info:");
        car1.displayInfo();

        System.out.println("Car 2 info:");
        car2.displayInfo();
    }
}