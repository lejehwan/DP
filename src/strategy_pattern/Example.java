package strategy_pattern;

public class Example {

    /**
     * 전략 패턴(Strategy Pattern)
     * 행동(behavior)을 캡슐화하고, 런타임에 행동을 서로 교환할 수 있도록(interchangeable) 만드는 디자인패턴
     * 클라이언트는 동일한 인터페이스를 사용하면서도 다양한 방법을 선택하고 사용할 수 있음
     *
     * 유연성 및 확장성: 새로운 전략을 추가하거나 기존 전략을 수정할 때, 컨텍스트 코드를 변경할 필요가 없음
     * 응집도 향상 및 결합도 감소: 각 전략이 하나의 알고리즘에 집중하여 응집도 향상 및 컨텍스트는 구체적인 전략을 알 필요가 없어(인터페이스만 알면 됨) 결합도 감소
     * 재사용성: 동일한 전략을 여러 컨텍스트에서 사용 가능
     * 다형성 활용: 런타임에 동적으로 변경 가능
     *
     * - 알고리즘이나 행위가 런타임에 동적으로 변경되어야 할 필요가 있는 거의 모든 상황 -
     * 1. 결제 시스템(결제 방식), 정렬 알고리즘(정렬 방식), 압축 및 해제(압축 및 해제 방식), 경로 탐색(최단 경로 및 최적 경로 등)
     * 2. 복잡한 조건문(if-else/switch-case)를 줄이고 싶을 때
     * 3. 알고리즘의 변화가 예상될 때(미래에 새로운 알고리즘 추가 및 기존 알고리즘의 변경 가능성이 높은 경우)
     * 4. 객체의 행위가 고정되지 않고, 실행 중에 필요에 따라 다른 행위로 교체되어야 할 때
     */
    public static void main(String[] args) {
        strategyPatternExample();
    }

    private static void strategyPatternExample() {
        // 컨텍스트(Context): 전략 객체를 사용하는 클래스
        Order order = new Order();

        // 전략 인터페이스를 구현하는 다양한 구현체들(전략 클래스들)
        // 클라이언트는 신용카드, 현금, 간편결제(카카오페이) 등으로 다양한 방법으로 결제 가능
        order.setPaymentStrategy(new CreditCardPayment());
        order.checkout(10000);

        order.setPaymentStrategy(new CashPayment());
        order.checkout(5000);

        order.setPaymentStrategy(new KakaoPayPayment());
        order.checkout(20000);
    }

}
