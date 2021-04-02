package carapp;

public class Truck extends Vehicle implements DriveAble{
    public final double  TAX = .020;

    public Truck(String name, int qty, double price, Engine engine, int speed) {
        super(name, qty, price, engine, speed);
    }

    public void totalAfterTax(Vehicle vehicle){
        double tax = vehicle.getPrice() * TAX;
        double total = vehicle.getPrice() + tax + tax;
        System.out.println(total * getQty());
    }

    @Override
    public int milesPerHour() {
        return getSpeed();
    }
}
