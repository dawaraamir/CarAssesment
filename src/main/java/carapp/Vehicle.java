package carapp;

public abstract class Vehicle extends Product{
    private int qty;
    private double price;
    private Engine engine;
    private int speed;
    private final double  TAX = .015;

    public Vehicle(String name, int qty, double price, Engine engine, int speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }

    public double getTAX() {
        return TAX;
    }

    public double totalBeforeTax(Vehicle vehicle){
        return vehicle.getPrice() * vehicle.getQty();
    }
    public double calcTax(Vehicle vehicle) {

        return TAX * totalBeforeTax(vehicle);
    }

    public abstract void totalAfterTax(Vehicle vehicle);
}
