public class HotChocolate extends Beverage {
    public HotChocolate() {
        description = "HotChocolate";
    }
    
    public double getCost() {
        double cost = 3.90;
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






