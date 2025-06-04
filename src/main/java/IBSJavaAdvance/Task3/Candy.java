package IBSJavaAdvance.Task3;

public class Candy extends Sweets{
    private Boolean hasNuts;

    public Candy(String name, Double weight, Double price, boolean nuts) {
        super(name, weight, price);
        this.hasNuts = nuts;
    }

    public Boolean getHasNuts() {
        return hasNuts;
    }

    public void setHasNuts(Boolean hasNuts) {
        this.hasNuts = hasNuts;
    }
}
