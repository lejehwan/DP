package strategy_pattern;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + "원이 신용카드로 결제되었습니다.");
    }
}
