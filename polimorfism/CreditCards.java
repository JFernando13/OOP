package polimorfism;

public class CreditCards implements PaymentMethod {
  private String creditNumber;

  public CreditCards(String creditNumber) {
    this.creditNumber = creditNumber;
  }

  @Override
  public void buy(double amount) {
    System.out.println("Has pagado " + amount + " de la tarjeta con numero: " + this.creditNumber);
  }
}
