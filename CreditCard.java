public class CreditCard{
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = limit;
        balance = new Money(0);
    }

    public double getBalance() {
        return this.balance.getDollars();
    }

    public double getCreditLimit() {
        return this.creditLimit.getDollars();
    }

    public void charge(Money amount) {
        double remainingBalance = this.creditLimit.getDollars() - this.balance.getDollars();
        if (amount.getDollars() < remainingBalance) {
            this.balance.setDollars(remainingBalance - amount.getDollars());
        } else {
            System.out.println("Error, charge amount is greater than the remaining balance");
        }
    }

    public void payment(Money amount) {
        this.balance.setDollars(this.balance.getDollars() - amount.getDollars());
    }
}