public class ChocoSyrup extends CondimentDecorator {
    Beverage beverage;

    public ChocoSyrup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Chocolate Syrup";
    }

    @Override
    public double getCost() {
        return 0.35 + beverage.getCost();
    }
}
