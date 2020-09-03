public class TV extends Device{

    public TV(String brand, String model, String madeIn, double price, boolean hasBattery, boolean hasMemory, double screenSize) {
        setInfo( brand,  model,  madeIn, price, hasBattery, hasMemory, screenSize);
    }

    private boolean hasRemoteControl;

    public boolean setInfo() {
        return hasRemoteControl;
    }

    public void watch() {
        System.out.println("Watch method was called!");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasMemory=" + hasMemory +
                ", remoteControl=" +
                '}';
    }
}
