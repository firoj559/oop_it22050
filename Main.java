class Vehicle {
    String paintColor;
    int maxSpeed;

    void move() {
        System.out.println("Firoj is moving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(); // object creation
        myVehicle.paintColor = "Red";
        myVehicle.maxSpeed = 100;
        myVehicle.move();
    }
}
