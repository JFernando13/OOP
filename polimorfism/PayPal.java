package polimorfism;

public class PayPal implements  PaymentMethod {
  @Override
  public void buy(double amount) {
    System.out.printf("Pagaste un monto de %s con paypal\n", amount);
  }
}
