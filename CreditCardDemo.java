public class CreditCardDemo {
   public static void main(String[] args) {
      final Money LIMIT = new Money(1000);
      final Money FIRST_AMOUNT = new Money(200);
      final Money SECOND_AMOUNT = new Money(10.02);
      final Money THIRD_AMOUNT = new Money(25);
      final Money FOURTH_AMOUNT = new Money(990);

      Address newAddress = new Address("somewhere", "SJ", "NL", "a32s1d");
      Person owner = new Person("Chistine", "Someone", newAddress);

      CreditCard visa = new CreditCard(owner, LIMIT);

      // System.out.println(visa.getPersonals());
      System.out.println("Balance - " + visa.getBalance());
      System.out.println("Credit Limit: " + visa.getCreditLimit());
      System.out.println();
      System.out.println("Attempt to charge: " + FIRST_AMOUNT.getDollars());

      visa.charge(FIRST_AMOUNT);
      System.out.println("Balance: " + visa.getBalance());
      System.out.println("Attempt to charge: " + SECOND_AMOUNT.getDollars());
      visa.charge(SECOND_AMOUNT);
      System.out.println("Balance: " + visa.getBalance());
      System.out.println("Attempt to charge: " + THIRD_AMOUNT.getDollars());
      visa.charge(THIRD_AMOUNT);
      System.out.println("Balance: " + visa.getBalance());
      System.out.println("Attempt to charge: " + FOURTH_AMOUNT.getDollars());
      visa.charge(FOURTH_AMOUNT);
      System.out.println("Attempt to charge: " + visa.getBalance());
   }
}
