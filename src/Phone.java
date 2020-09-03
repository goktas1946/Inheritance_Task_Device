public class Phone extends Device{

    public Phone(String brand, String model, String madeIn, double price, boolean hasBattery, boolean hasMemory, double screenSize) {
        setInfo( brand,  model,  madeIn, price, hasBattery, hasMemory, screenSize);
    }

    private boolean hasSimCard;
    private String os;

    public void setInfo(boolean hasSimCard, String os) {
        this.hasSimCard = hasSimCard;
        this.os = os;
    }

    public void call() {
        System.out.println("Call method was called!");
    }

    public void text() {
        System.out.println("Text method was called!");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasMemory=" + hasMemory +
                ", screenSize=" + screenSize +
                ", hasSimCard=" + hasSimCard +
                ", OS=" + os +
                "}";
    }
}
