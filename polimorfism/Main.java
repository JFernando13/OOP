package polimorfism;

public class Main {
  public static void main(String[] args) {

    PaymentMethod creaditCard = new CreditCards("9234789930");
    PaymentMethod paypal = new PayPal();

    Buy shoes = new Buy(2000, paypal);
    Buy shirt = new Buy(1, creaditCard);

    shoes.buying();
    shirt.buying();
  }
}
