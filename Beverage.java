public abstract class Beverage {
    String description = "Unknown Beverage";
    String size = "Small";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
