public class Caramel extends CondimentDecorator {
    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Caramel";
    }

    @Override
    public double getCost() {
        return 0.30 + beverage.getCost();
    }
}
