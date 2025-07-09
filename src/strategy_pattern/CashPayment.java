package strategy_pattern;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + "원이 현금으로 결제되었습니다.");
    }
}
