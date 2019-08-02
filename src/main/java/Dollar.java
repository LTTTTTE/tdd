

public class Dollar {

    private int amount;

    public Dollar(int amont){
        this.amount = amont;
    }
    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.getAmount();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
