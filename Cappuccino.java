public class Cappuccino extends Beverage {
    public Cappuccino() {
        description = "Cappuccino";
    }
    
    public double getCost() {
        double cost = 3.49;
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





