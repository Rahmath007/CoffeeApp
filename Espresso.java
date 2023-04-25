public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    
    public double getCost() {
        double cost = 1.99;
        if (size.equals("Small")) {
            cost += 0.50;
        } else if (size.equals("Medium")) {
            cost += 1.00;
        } else if (size.equals("Large")) {
            cost += 1.50;
        }
        return cost;
    }
}


