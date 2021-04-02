package carapp;

public class Car extends Vehicle implements DriveAble{
    public Car(String name, int qty, double price, Engine engine, int speed) {
        super(name, qty, price, engine, speed);
    }

    public void totalAfterTax(Vehicle vehicle){
        double tax = vehicle.getPrice() * getTAX();
        double total = vehicle.getPrice() + tax + tax;
        System.out.println(total * getQty());
    }
    public int milesPerHour(){
    return getSpeed();
    }

}
