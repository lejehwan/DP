package strategy_pattern;

public class KakaoPayPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + "원이 카카오페이로 결제되었습니다.");
    }
}
