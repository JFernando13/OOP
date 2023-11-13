package polimorfism;

public class Buy {
  private double amount;
  private PaymentMethod paymentMethod;

  public Buy(double amount, PaymentMethod paymentMethod) {
    this.amount = amount;
    this.paymentMethod = paymentMethod;
  }

  public void buying() {
    paymentMethod.buy(amount);
  }
}
