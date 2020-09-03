public class Device {

    public String brand;
    public String model;
    public String madeIn;
    public double price;
    public boolean hasBattery;
    public boolean hasMemory;
    public double screenSize;

    public void setInfo(String brand, String model, String madeIn, double price, boolean hasBattery, boolean hasMemory, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.madeIn = madeIn;
        this.price = price;
        this.hasBattery = hasMemory;
        this.hasMemory = hasMemory;
        this.screenSize = screenSize;
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasMemory=" + hasMemory +
                '}';
    }
}
