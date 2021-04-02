package carapp;

public class MotorBike extends Vehicle{
    private int numOfWheels;

    public MotorBike(String name, int qty, double price, Engine engine, int speed, int numOfWheels) {
        super(name, qty, price, engine, speed);
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void totalAfterTax(Vehicle vehicle){
        System.out.println(calcTax(vehicle) + getPrice());
    }
}
