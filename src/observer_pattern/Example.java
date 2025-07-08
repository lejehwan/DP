package observer_pattern;

public class Example {

    /**
     * 옵저버 패턴(Observer Pattern)
     * 객체간 일대다(one-to-many) 의존성을 정의하며, 한 객체의 상태가 변경될 때 그 객체에 의존하는 모든 객체(옵저버)들에게 자동으로 알림이 가고 업데이트 되도록 하는 방식
     * 발행/구독(Publish/Subscribe) 패턴으로도 불림
     *
     * **느슨한 결합**과 유연한 확장성, 변경 사항 전파 자동화
     * 즉, 상태 변화를 통지하는 객체(주제, Subject)는 자신에게 어떤 옵저버들이 붙어있는지, 어떤 방식으로 업데이트 되는지 알 필요가 없음.
     * 그저 옵저버 인터페이스에 따라 알림을 보냄
     *
     * - 변경 사항을 다수의 이해 관계자에게 효율적으로 전파해야 하는 모든 상황 -
     * 1. Swing 과 같은 GUI 프레임워크의 리스너(Listener) 형태로 구현된 이벤트
     * 2. 이벤트/메시징 시스템(쇼핑몰에서 상품 주문 완료라는 이벤트 발생 시, (재고 관리 | 배송 | 고객 알림) 등 여러 모듈에 동시 알림 처리
     * 3. MVC 패턴에서 Model 의 변경 사항을 View 에 반영할 때
     * 4. Message Queue 또는 Kafka 와 결합하여 이벤트 기반 아키텍처를 구현할 때
     * 5. 실시간으로 변경되는 데이터를 여러 클라이언트에게 전파 해야할 때
     */
    public static void main(String[] args) {
        observerPatternExample();
    }

    private static void observerPatternExample() {
        // 주제(Subject) 또는 발행자(Publisher) : 옵저버들의 목록을 관리(등록/해지) 및 자신의 상태가 변경될 때 등록된 모든 옵저버에게 알림을 보냄
        NewsAgency koreaTimes = new NewsAgency();

        // 옵저버(Observer) 또는 구독자(Subscriber) : 주제의 상태 변화에 관심 있는 객체들(알림을 받았을 때 수행할 메서드(update)를 정의)
        NewsSubscriber kimReader = new NewspaperReader("김씨");
        NewsSubscriber leeReader = new NewspaperReader("이씨");
        NewsSubscriber parkReader = new MobileAppUser("박씨");

        koreaTimes.addSubscriber(kimReader);
        koreaTimes.addSubscriber(leeReader);
        koreaTimes.addSubscriber(parkReader);
        koreaTimes.publishNews("디자인 패턴을 공부해봅시다.");

        koreaTimes.removeSubscriber(leeReader);
        koreaTimes.publishNews("이게 옵저버 패턴..?");

    }

}
