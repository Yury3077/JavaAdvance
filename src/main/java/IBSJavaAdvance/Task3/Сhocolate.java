package IBSJavaAdvance.Task3;

public class Сhocolate extends Sweets {
    private String type;

    public Сhocolate(String name, Double weight, Double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
