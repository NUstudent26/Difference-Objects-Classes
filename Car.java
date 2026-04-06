public class Car {
    // This is the class (blueprint)
    String color;
    int speed;

    // Constructor: creates an object with specific values
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Method to display info about the car
    public void displayInfo() {
        System.out.println("Color: " + color + ", Speed: " + speed);
    }
}