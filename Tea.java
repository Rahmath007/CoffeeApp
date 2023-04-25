public class Tea extends Beverage {
    public Tea() {
        description = "Tea";
    }
    
    public double getCost() {
        double cost = 2.20;
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






