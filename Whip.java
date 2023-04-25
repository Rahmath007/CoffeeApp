public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Whip cream";
    }

    @Override
    public double getCost() {
        return 0.20 + beverage.getCost();
    }
}
