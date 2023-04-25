import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        try (// Prompt the user to enter the type of coffee they want
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Coffee Shop! What kind of coffee would you like?");
            System.out.println("1. Espresso : £1.99");
            System.out.println("2. Latte : £2.99");
            System.out.println("3. Cappuccino : £3.49");
            System.out.println("4. HotChocolate : £3.90");
            System.out.println("5. Tea : £2.20");
            System.out.println("6. Americano : £3.50");

            // Create the appropriate Beverage object based on the user's choice
            Beverage beverage = null;
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    beverage = new Espresso();
                    break;
                case 2:
                    beverage = new Latte();
                    break;
                case 3:
                    beverage = new Cappuccino();
                    break;
                case 4:
                    beverage = new HotChocolate();
                    break;
                case 5:
                    beverage = new Tea();
                    break;
                case 6:
                    beverage = new Americano();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    System.exit(1);
            }
            
            // Prompt the user to enter the size of the coffee they want
            System.out.println("What size would you like?");
            System.out.println("1. Small cost extra £0.50");
            System.out.println("2. Medium cost extra £1.00");
            System.out.println("3. Large cost extra £1.50");
            String size = "";
            int sizeChoice = scanner.nextInt();
            switch (sizeChoice) {
                case 1:
                    size = "Small";
                    break;
                case 2:
                    size = "Medium";
                    break;
                case 3:
                    size = "Large";
                    break;
                default:
                    System.out.println("Invalid size choice!");
                    System.exit(1);
}
                beverage.setSize(size);

            // Decorate the Beverage object with condiments based on user input
            while (true) {
                System.out.println("Would you like to add a condiment? (Y/N)");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("Y")) {
                    System.out.println("What kind of condiment would you like?");
                    System.out.println("1. Mocha : £0.20");
                    System.out.println("2. Whip : £0.20");
                    System.out.println("3. Caramel Syrup : £0.30");
                    System.out.println("4. Chocolate Syrup : £0.35");
                    int condimentChoice = scanner.nextInt();
                    switch (condimentChoice) {
                        case 1:
                            beverage = new Mocha(beverage);
                            break;
                        case 2:
                            beverage = new Whip(beverage);
                            break;
                        case 3:
                            beverage = new Caramel(beverage);
                            break;
                        case 4:
                            beverage = new ChocoSyrup(beverage);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                } else {
                    break;
                }
            }

            // Print the final description and cost of the Beverage object
            System.out.println("You ordered a " + size + " " + beverage.getDescription() + ".");
            System.out.println("The total cost is £" + (beverage.getCost()) + ".");
        }
    }
}
