package IBSJavaAdvance.Task3;

public class Gift {
    private Double totalWeight;
    private Double totalPrice;
    private Sweets[] allSweets;
    private String[] allSweetsNames;

    public Gift(Sweets... sweets) {
        this.allSweets = sweets;

        this.totalWeight = 0.0;
        this.totalPrice = 0.0;
        this.allSweetsNames = new String[sweets.length];

        for (int i = 0; i < sweets.length; i++) {
            this.totalWeight = this.totalWeight + sweets[i].getWeight();
            this.totalPrice = this.totalPrice + sweets[i].getPrice();
            this.allSweetsNames[i] = sweets[i].getName();
        }
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Подарок состоит из: " + String.join(", ", this.allSweetsNames) + "\n" +
                "Общий вес: " + this.totalWeight.toString() + "\n" +
                "Общая стоимость: " + this.totalPrice.toString();
    }
}
