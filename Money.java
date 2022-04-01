public class Money {
    private double dollars;
    private double cents;

    Money(double amount){
        this.dollars = amount;
    }

    Money(Money otherObject){
        this.dollars = otherObject.getDollars();
        this.cents = otherObject.getCents();
    }

    public double getDollars() {
        return dollars;
    }

    public void setDollars(double dollars) {
        this.dollars = dollars;
    }

    public double getCents() {
        return cents;
    }

    public void setCents(double cents) {
        this.cents = cents;
    }
}

