public class Laptop extends Device{

    public Laptop(String brand, String model, String madeIn, double price, boolean hasBattery, boolean hasMemory, double screenSize) {
        setInfo( brand,  model,  madeIn, price, hasBattery, hasMemory, screenSize);
    }

    private boolean hasCPU;
    private boolean hasMouse;
    private boolean hasKeyboard;
    private String os;

    public void setInfo(boolean hasCPU, boolean hasMouse, boolean hasKeyboard, String os) {
        this.hasCPU = hasCPU;
        this.hasMouse = hasMouse;
        this.hasKeyboard = hasKeyboard;
        this.os = os;
    }

    public void coding() {
        System.out.println("Coding method was called!");
    }

    public void watching() {
        System.out.println("Watching method was called!");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasMemory=" + hasMemory +
                ", hasCPU=" + hasCPU +
                ", hasMouse=" + hasCPU +
                ", hasKeyboard=" + hasCPU +
                "OS=" + os +
                '}';
    }
}
