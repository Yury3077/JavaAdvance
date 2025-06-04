package IBSJavaAdvance.Task3;

public class Lollipop extends Sweets {
    private String color;

    public Lollipop(String name, Double weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
